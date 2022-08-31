package com.example.dndcharacterorganizer;

import androidx.room.TypeConverter;

public class Converters {
    //TypeConverter for Spell to String
    @TypeConverter
    public static String spelltoString(Spell spell){
        return spell.toString();
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
    public static String skillsToString(Skill[] skills){
    return "";
    }

    //TypeConverter for String to Skills[]
    @TypeConverter
    public static Skill[] stringToSkills(String string){
        Skill[] skills = new Skill[0];
        return skills;
    }


    //Type Converter for String to Spell
    @TypeConverter
    public static Spell stringToSpell(String value){
        String[] temp = value.split(";");
        Spell spell = new Spell(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),temp[2],temp[3],temp[4],Boolean.parseBoolean(temp[5]),Boolean.parseBoolean(temp[6]),temp[8],temp[9],Boolean.parseBoolean(temp[10]),temp[11],temp[12],Boolean.parseBoolean(temp[13]),temp[14],temp[15],temp[16]);
        return spell;
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
}
