package com.example.dndcharacterorganizer;

import java.util.ArrayList;

public class Artificer extends DnD_Class {
    private int infusions;
    private int infused_items;
    private int[] spellSlots;
    private int[] spellSlotsUsed;


    public Artificer(){
        this.setLevel(0);

        ArrayList<Ability> abilities = this.getAbilities();
        abilities = new ArrayList<Ability>();
        this.setAbilities(abilities);

        ArrayList<Spell> spells = this.getSpellList();
        spells = new ArrayList<Spell>();
        this.setSpellList(spells);

        this.spellSlots = new int[]{0,0,0,0,0};
        this.spellSlotsUsed = new int[]{0,0,0,0,0};
    }
    @Override
    public String toString() {

        return "Artificer{" ;
    }

    @Override
    public void shortrest(){

    }

    @Override
    public void longrest(){

    }

    @Override
    public void levelup(){
        this.setLevel(this.getLevel()+1);

        switch(this.getLevel()){

            case 1:
                /*
                       Adding the Magical Tinkering ability for the artificer. Setting a name and description for adding to the abilities array.

                 */
                String name = "Magical Tinkering";
                String description = "At 1st level, you've learned how to invest a spark of magic into mundane objects. To use this ability, you must have thieves' tools or artisan's tools in hand. You then touch a Tiny nonmagical object as an action and give it one of the following magical properties of your choice:\n" +
                        "\n" +
                        "    The object sheds bright light in a 5-foot radius and dim light for an additional 5 feet.\n" +
                        "\n" +
                        "    Whenever tapped by a creature, the object emits a recorded message that can be heard up to 10 feet away. You utter the message when you bestow this property on the object, and the recording can be no more than 6 seconds long.\n" +
                        "\n" +
                        "    The object continuously emits your choice of an odor or a nonverbal sound (wind, waves, chirping, or the like). The chosen phenomenon is perceivable up to 10 feet away.\n" +
                        "\n" +
                        "    A static visual effect appears on one of the object's surfaces. This effect can be a picture, up to 25 words of text, lines and shapes, or a mixture of these elements, as you like.\n" +
                        "\n" +
                        "The chosen property lasts indefinitely. As an action, you can touch the object and end the property early.\n" +
                        "\n" +
                        "You can bestow magic on multiple objects, touching one object each time you use this feature, though a single object can only bear one property at a time. The maximum number of objects you can affect with this feature at one time is equal to your Intelligence modifier (minimum of one object). If you try to exceed your maximum, the oldest property immediately ends, and then the new property applies.";

                Ability temp = new Ability(name, description);
                this.getAbilities().add(temp);

                /*
                        Adding the Ritual Casting ability to the ability array.
                 */
                name = "Ritual Casting";
                description = "You can cast an artificer spell as a ritual if that spell has the ritual tag and you have the spell prepared.";
                temp = new Ability(name, description);
                this.getAbilities().add(temp);

                /*
                        Setting spellcasting to true. Pulls spells from the database and lets the user select from the list.
                 */
                this.setSpellcaster(true);
                this.spellSlots[0] = 2;


                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;

        }
    }

    void selectSpells(){

    }
}
