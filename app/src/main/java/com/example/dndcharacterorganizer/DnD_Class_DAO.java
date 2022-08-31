package com.example.dndcharacterorganizer;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DnD_Class_DAO {
    @Query("SELECT * FROM dnd_class")
    List<DnD_Class> getAll();

    @Query("SELECT * FROM dnd_class Where class_name LIKE :name")
    DnD_Class findByName(String name);

    @Query("SELECT * FROM dnd_class")
    Cursor getAllCursor();


    @Insert
    void insertAll(DnD_Class ... dnd_class);

    @Delete
    void delete(DnD_Class ... dnd_class);
}
