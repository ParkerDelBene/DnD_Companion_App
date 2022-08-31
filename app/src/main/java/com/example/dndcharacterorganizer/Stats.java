package com.example.dndcharacterorganizer;

import androidx.room.Entity;

@Entity
public class Stats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int speed;
    private int hitpoints;
    private int initiative;
    private int passive_perception;

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int speed, int hitpoints, int initiative, int passive_perception){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.speed = speed;
        this.hitpoints = hitpoints;
        this.initiative = initiative;
        this.passive_perception = passive_perception;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getPassive_perception() {
        return passive_perception;
    }

    public void setPassive_perception(int passive_perception) {
        this.passive_perception = passive_perception;
    }

    public String toString(){
        String temp = "";
        return temp + this.strength + "," + this.dexterity + "," + this.constitution + "," + this.intelligence + "," + this.wisdom + "," + this.charisma + "," + this.speed+ "," + this.hitpoints+ "," + this.initiative+ "," + this.passive_perception;
    }
}
