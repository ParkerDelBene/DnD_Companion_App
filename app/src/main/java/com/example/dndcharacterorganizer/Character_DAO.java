package com.example.dndcharacterorganizer;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Character_DAO {
    @Query("SELECT * FROM character")
    List<Character> getAll();

    @Query("SELECT * FROM character WHERE character_name LIKE :name")
    Character getCharacterByName(String name);
}
