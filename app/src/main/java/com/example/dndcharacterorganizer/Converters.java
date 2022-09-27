package com.example.dndcharacterorganizer;

import android.widget.ArrayAdapter;

import androidx.room.TypeConverter;

import java.util.ArrayList;

public class Converters {
    //TypeConverter for SpellList to String
    @TypeConverter
    public static String spellstoString(ArrayList<Spell> spellList){
        String string = "";
        int size = spellList.size();
        int num = 0;
        while (num<size){
            string += spellList.get(num).toString();
            string += ";";
            num++;
        }
        return string;
    }

    //TypeConvert for DnD_Class
    @TypeConverter
    public static String DnDClassToString(DnD_Class name){
        return null;
    }

    //TypeConverter for DnD_Class
    @TypeConverter
    public static DnD_Class stringToDnD_Class(String string){
        return null;
    }

    //TypeConverter for Skills[]
    @TypeConverter
    public static String skillsToString(ArrayList<Skill> skills){
        String string = "";
        int size = skills.size();
        int num = 0;
        while (num<size){
            string += skills.get(num).toString();
            string += ";";
            num++;
        }
        return string;
    }

    //TypeConverter for String to Skills[]
    @TypeConverter
    public static ArrayList<Skill> stringToSkills(String string){
        ArrayList<Skill> skills = new ArrayList<>();
        String[] split = string.split(";");
        int num = 0;
        while(num < split.length){
            Skill temp = new Skill(split[num],Integer.parseInt(split[num+1]),split[num+2]);
            num+=3;
        }
        return skills;
    }


    //Type Converter for String to Spell
    @TypeConverter
    public static ArrayList<Spell> stringToSpell(String string){
        String[] split = string.split(";");
        ArrayList<Spell> spellList = new ArrayList<>();
        int size = split.length;
        int num = 0;
        while(num < size){
            Spell temp = new Spell(Integer.parseInt(split[num]),Integer.parseInt(split[num+1]),split[num+2],split[num+3],split[num+4],Boolean.parseBoolean(split[num+5]),Boolean.parseBoolean(split[num+6]),split[num+7],split[num+8],Boolean.parseBoolean(split[num+9]),split[num+10],split[num+111],Boolean.parseBoolean(split[num+12]),split[num+13],split[num+14],split[num+15]);

            spellList.add(temp);
            num += 16;

        }

        return spellList;
    }

    //TypeConvert for Stats object to String
    @TypeConverter
    public static String statsToString(Stats stats){
        return stats.toString();
    }

    //TypeConverter for String to Stats
    @TypeConverter
    public static Stats stringToStats(String value){
        String[] temp = value.split(",");
        Stats stats = new Stats(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),Integer.parseInt(temp[4]),Integer.parseInt(temp[5]),Integer.parseInt(temp[6]),Integer.parseInt(temp[7]),Integer.parseInt(temp[8]),Integer.parseInt(temp[9]));
        return stats;
    }

    //TypeConverter for Feats to String
    @TypeConverter
    public static String featsToString(Feats feats){
        return feats.id + "";
    }

    //TypeConverter for String to Feats
    @TypeConverter
    public static Feats stringToFeats(String value){
        return new Feats();
    }

    //TypeConverter for Proficiency to String
    @TypeConverter
    public static String proficiencyToString(ArrayList<Proficiency> proficiency){
        String string = "";
        int size = proficiency.size();
        int num = 0;
        while (num<size){
            string += proficiency.get(num).toString();
            string += ";";
            num++;
        }
        return string;
    }

    //TypeConverter for String to Proficiency
    @TypeConverter
    public static ArrayList<Proficiency> stringToProficiency(String string){
        String[] split = string.split(";");
        ArrayList<Proficiency> proficiency = new ArrayList<>();
        int size = split.length;
        int num = 0;
        while(num < size){
            Proficiency temp = new Proficiency(split[num],Integer.parseInt(split[num+1]),split[num+2]);

            proficiency.add(temp);
            num += 3;

        }

        return proficiency;
    }

    //TypeConverter for Ability to String
    @TypeConverter
    public static String abilityToString(ArrayList<Ability> abilities){
        String string = "";
        int size = abilities.size();
        int num = 0;
        while (num<size){
            string += abilities.get(num).toString();
            string += ";";
            num++;
        }
        return string;
    }

    //TypeConverter for String to Ability
    @TypeConverter
    public static ArrayList<Ability> stringtoAbility(String string){
        String[] split = string.split(";");
        ArrayList<Ability> ability = new ArrayList<>();
        int size = split.length;
        int num = 0;
        while(num < size){
            Ability temp  = new Ability(split[num],Boolean.parseBoolean(split[num+1]),Boolean.parseBoolean(split[num+2]),split[num+3]);
            ability.add(temp);
            num+=4;
        }
        return ability;
    }

    //TypeConverter for String to Inventory
    @TypeConverter
    public static ArrayList<Object> stringToInventory(String string){
        ArrayList<Object> inventory = new ArrayList<>();

        return inventory;
    }

    //TypeConverter for Inventory to String
    @TypeConverter
    public static String inventoryToString(ArrayList<Object> inventory){
        return "";
    }
}


