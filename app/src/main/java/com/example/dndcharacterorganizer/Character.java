package com.example.dndcharacterorganizer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Character {

    @PrimaryKey
    public int id;
    /*
        This is where the basic statistics of the character are stored.

        Things like hitpoint, level, speed, initiative, and passive perception are stored directly in the class
            while things like the stats and class are stored in separate classes.
            This is done so that separate levelup functions can be declared in each class and then called in this class

        Background is stored in this class because it is only applied once during the creation of the character while
            Classes can have effects during levelup process;
     */
    private int level;
    private int proficiencyBonus;
    private Feats feats;
    private Stats stats;
    @ColumnInfo(name = "character_name")
    private String name;
    private DnD_Class classname;
    private String background;
    private ArrayList<Object> inventory;


    public int getLevel() {
        return level;
    }

    public Stats getStats() {
        return stats;
    }

    public DnD_Class getClassname(){return classname;}

    public Character(){

    }

    public Character(int hitpoints, int level, int speed,int initiative, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int passive_perception, String name, String classname, String background){
        this. level = level;
        this.stats = new Stats(strength,dexterity,constitution,intelligence,wisdom,charisma,speed,hitpoints,initiative,passive_perception);
        this.name = name;
        this.background = background;
        this.id = 0;
        for(int i = 0; i < this.name.length(); i++){
            int temp = (int) this.name.charAt(i);
            this.id += temp;
        }
    }

    public void levelup(){

    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setFeats(Feats feats) {
        this.feats = feats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassname(DnD_Class classname) {
        this.classname = classname;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Feats getFeats() {
        return feats;
    }

    public String getName() {
        return name;
    }

    public String getBackground() {
        return background;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public ArrayList<Object> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.inventory = inventory;
    }
}
