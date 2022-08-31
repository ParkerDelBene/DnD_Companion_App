package com.example.dndcharacterorganizer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Spell implements Comparable<Spell> {
    @PrimaryKey
    private int id;

    @ColumnInfo(name = "level")
    private int level;
    private String school;
    private String name;
    private String description;
    private boolean attack;
    private boolean savingthrow;
    private String time;
    private String range;
    private boolean concentration;
    private String duration;
    private String components;
    private boolean upcast;
    private String damage;
    private String upcastdamage;

    @ColumnInfo(name = "spellList")
    private String spellList;

    public int getLevel() {
        return level;
    }

    public int getId() {
        return id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAttack() {
        return attack;
    }

    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    public boolean isSavingthrow() {
        return savingthrow;
    }

    public void setSavingthrow(boolean savingthrow) {
        this.savingthrow = savingthrow;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public boolean isConcentration() {
        return concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public boolean isUpcast() {
        return upcast;
    }

    public void setUpcast(boolean upcast) {
        this.upcast = upcast;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getUpcastdamage() {
        return upcastdamage;
    }

    public void setUpcastdamage(String upcastdamage) {
        this.upcastdamage = upcastdamage;
    }

    public String getSpellList() {
        return spellList;
    }

    public void setSpellList(String spellList) {
        this.spellList = spellList;
    }

    public int compareTo(Spell spell){
        return this.level - spell.level;
    }

    public Spell(int id, int level, String school, String name, String description, boolean attack, boolean savingthrow, String time, String range, boolean concentration, String duration, String components, boolean upcast, String damage, String upcastdamage, String spellList) {
        this.id = id;
        this.level = level;
        this.school = school;
        this.name = name;
        this.description = description;
        this.attack = attack;
        this.savingthrow = savingthrow;
        this.time = time;
        this.range = range;
        this.concentration = concentration;
        this.duration = duration;
        this.components = components;
        this.upcast = upcast;
        this.damage = damage;
        this.upcastdamage = upcastdamage;
        this.spellList = spellList;
    }

    public String toString(){
        return id + ";" + level + ";" + school + ";" + name + ";" + description + ";" + attack + ";" + savingthrow + ";" + time + ";" + range + ";" + concentration + ";" + duration + ";" + components + ";" + upcast + ";" + damage + ";" + upcastdamage + ";" + spellList;
    }

}
