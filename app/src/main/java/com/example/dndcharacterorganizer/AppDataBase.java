package com.example.dndcharacterorganizer;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

@Database(entities = {DnD_Class.class,Character.class,Feats.class,Spell.class}, version = 2, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class AppDataBase extends RoomDatabase {
    public abstract Character_DAO character_dao();
    public abstract Spell_DAO spell_dao();
}
