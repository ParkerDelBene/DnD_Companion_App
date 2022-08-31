package com.example.dndcharacterorganizer;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity
abstract public class DnD_Class {

    @PrimaryKey
    private int id;
    private ArrayList<Proficiency> proficiencies;
    private ArrayList<Skill> skills;
    private Stats stats;
    private int level = 0;
    private ArrayList<Ability> abilities;
    private ArrayList<Spell> spellList;
    private boolean spellcaster;
    private String spellcastingstat;

    public abstract String toString();
    public abstract void levelup(Stats stats);
    public abstract void shortrest();
    public abstract void longrest();

    public void setProficiencies(ArrayList<Proficiency> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public Stats getStats() {
        return stats;
    }

    public int getLevel() {
        return level;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isSpellcaster() {
        return spellcaster;
    }

    public void setSpellcaster(boolean spellcaster) {
        this.spellcaster = spellcaster;
    }


    public String getSpellcastingstat() {
        return spellcastingstat;
    }

    public void setSpellcastingstat(String spellcastingstat) {
        this.spellcastingstat = spellcastingstat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Spell> getSpellList() {
        return spellList;
    }

    public void setSpellList(ArrayList<Spell> spellList) {
        this.spellList = spellList;
    }


}
