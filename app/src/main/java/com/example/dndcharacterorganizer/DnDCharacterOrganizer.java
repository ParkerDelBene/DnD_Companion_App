package com.example.dndcharacterorganizer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.room.Room;

import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import android.widget.TextView;

import com.skydoves.powerspinner.OnSpinnerItemSelectedListener;
import com.skydoves.powerspinner.PowerSpinnerView;

import java.util.List;

public class DnDCharacterOrganizer extends AppCompatActivity {

    AppDataBase db;
    private boolean statRoll = true;
    private boolean min72 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        //Initializing the Database
        db = Room.databaseBuilder(getApplicationContext(),AppDataBase.class, "DnD_Organizer_Database.db").build();


        Runnable spellCaching = new Runnable() {
            @Override
            public void run() {
                Spell_DAO spellDao = db.spell_dao();
                /*Debugging the SpellList DataBase*/
                //List<Spell> spelllist = spellDao.getAll();
                if (spellDao.getAll().size() == 0) {
                    String[] spells = getResources().getStringArray(R.array.spell_list);
                    int counter = 0;
                    for (String spell : spells) {
                        String[] temp = spell.split(";");
                        Spell newspell = new Spell(counter, Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], Boolean.parseBoolean(temp[4]), Boolean.parseBoolean(temp[5]), temp[6], temp[7], Boolean.parseBoolean(temp[8]), temp[9], temp[10], Boolean.parseBoolean(temp[11]), temp[12], temp[13], temp[14]);
                        spellDao.insertAll(newspell);
                        counter++;
                    }
                }
            }
        };

        //Checking if spells are cached
        new Thread(spellCaching).start();


    }

    public void create_Character(View view){

        //setting the Content view
        setContentView(R.layout.character_creation_start);


        //getting the class dropdown spinner
        PowerSpinnerView class_select = (PowerSpinnerView) findViewById(R.id.class_dropdown);
        /*
            Setting an Event Listener for the class_selector
            This is so we can populate the Character Subclass dropdown items.
         */
        class_select.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener<String>() {
            @Override public void onItemSelected(int oldIndex, @Nullable String oldItem, int newIndex, String newItem) {
                PowerSpinnerView subclass_select = (PowerSpinnerView) findViewById(R.id.subclass_dropdown);
                String selection = newItem.replace(' ','_');
                subclass_select.setItems(getResources().getIdentifier(selection,"array",getPackageName()));
            }
        });

        /*
            Setting on on long click listener to the class dropdown
         */
        class_select.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                on_Click_Description(view);
                return true;
            }
        });


        /*
            Creating Background array spinner
         */
        PowerSpinnerView background_spinner = (PowerSpinnerView) findViewById(R.id.background_dropdown);

        /*
            creating background long click listener
         */
        background_spinner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                on_Click_Description(view);
                return true;
            }
        });

        /*
            Creating Races array Spinner
        */

        PowerSpinnerView races_spinner = (PowerSpinnerView) findViewById(R.id.races_dropdown);

    }

    public void load_Character(View view){
        Character_DAO temp = db.character_dao();
        List<Character> allCharacters = temp.getAll();
    }

    public void exit_App(View view){
        finish();
        System.exit(1);

    }

    /*
        Function used to pop up a standard description for displaying the description of any items in a spinner.
     */
    public void on_Click_Description(View view){

        // Inflate the Layout of the Popup Window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.basic_description_popup, null);

        //create a popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        final PopupWindow popupWindow = new PopupWindow(popupView,width,height,true);

        PowerSpinnerView selected_spinner = (PowerSpinnerView) view;

        //Now we grab the selected item from the spinner and changing it so it can find the class description.
        int index = selected_spinner.getSelectedIndex();
        String resource_name = view.getTag().toString();
        resource_name = resource_name.substring(0,resource_name.indexOf('_')+1) + "array";
        String[] selection_array = getResources().getStringArray(getResources().getIdentifier(resource_name,"array",getPackageName()));
        String selection = selection_array[index];
        selection = selection + "_description";
        selection = selection.replace(' ','_');

        //Now we grab the id of the resource that we made the name of in selection
        int id = getResources().getIdentifier(selection,"string",getPackageName());

        //Finally we get the string using the id we computed

        String description = getString(id);
        //Grabbing the TextView from the popupView view
        TextView textView = popupView.findViewById(R.id.popup_description);

        textView.append(description);

        //show the popup window
        popupWindow.showAtLocation(view, Gravity.CENTER,0,-200);

        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                popupWindow.dismiss();
                return false;
            }
        });
    }

    public void confirm_Character(View view){
        /*
            Getting the Selected Stats for the Character.
         */

    }

    /*
        Handles the generating of random stats for the character creation screen.
     */
    public void generate_Random_Stats(View view) {
        ArrayList<Integer> randomStats = new ArrayList<>();
        ArrayList<Integer> stat = new ArrayList<>();
        Integer num = 0;
        Integer total = 0;

        if(min72) {
            do{
                randomStats.clear();
                total = 0;
                if (statRoll) {

                    for (int i = 0; i < 6; i++) {
                        Random random = new Random();
                        for (int j = 0; j < 4; j++) {
                            stat.add(random.nextInt(6) + 1);
                        }

                        Collections.sort(stat);


                        num += stat.get(1);
                        num += stat.get(2);
                        num += stat.get(3);

                        randomStats.add(num);
                        total += num;

                        num = 0;
                        stat.clear();

                    }


                } else {

                    for (int i = 0; i < 6; i++) {
                        Random random = new Random();
                        for (int j = 0; j < 3; j++) {
                            stat.add(random.nextInt(6) + 1);
                        }

                        Collections.sort(stat);

                        num += stat.get(0);
                        num += stat.get(1);
                        num += stat.get(2);

                        randomStats.add(num);
                        total += num;

                        num = 0;
                        stat.clear();
                    }
                }
            }while(total < 72);
        }
        else{
            if (statRoll) {

                for (int i = 0; i < 6; i++) {
                    Random random = new Random();
                    for (int j = 0; j < 4; j++) {
                        stat.add(random.nextInt(6) + 1);
                    }

                    Collections.sort(stat);


                    num += stat.get(1);
                    num += stat.get(2);
                    num += stat.get(3);

                    randomStats.add(num);
                    total += num;

                    num = 0;
                    stat.clear();

                }


            } else {

                for (int i = 0; i < 6; i++) {
                    Random random = new Random();
                    for (int j = 0; j < 3; j++) {
                        stat.add(random.nextInt(6) + 1);
                    }

                    Collections.sort(stat);

                    num += stat.get(0);
                    num += stat.get(1);
                    num += stat.get(2);

                    randomStats.add(num);

                    num = 0;
                    stat.clear();
                }
            }
        }

        for(int i = 0; i< 6; i++){

            String typename = getResources().getResourceTypeName(R.id.random_stat_1);
            TextView random_stat = (TextView) findViewById(getResources().getIdentifier("random_stat_" + (i+1),"id",getPackageName() ));
            random_stat.setText(randomStats.get(i).toString());
        }

    }

    /*
        Handles the selection of 4d6 vs 3d6
     */
    public void select_Stat_Roll(View view){
        statRoll = view.getId() == R.id.four_d_six;
    }

    /*
        Handles the switching of minimum of 72
     */
    public void select_min_72(View view){
        min72 = !min72;
    }

    /*
        Handles the switching from the character creation start page to the stat page.
     */
    public void character_stats_screen(View view){
        setContentView(R.layout.character_creation_stats);


    }


}