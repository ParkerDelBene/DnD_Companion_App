package com.example.dndcharacterorganizer;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Dao;

import java.util.List;

@Dao
public interface Spell_DAO {

    @Query("SELECT * FROM spell")
    List<Spell> getAll();

    @Query("SELECT * FROM spell WHERE spellList LIKE :spellList")
    List<Spell> getSpellByClasses(String spellList);

    @Insert
    void insertAll(Spell spell);

    @Delete
    void delete(Spell spell);

}
