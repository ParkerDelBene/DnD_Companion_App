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
    private boolean strengthSave;
    private boolean dexteritySave;
    private boolean constitutionSave;
    private boolean intelligenceSave;
    private boolean wisdomSave;
    private boolean charismaSave;


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

    public Stats(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int speed, int hitpoints, int initiative, int passive, boolean strengthSave, boolean dexteritySave, boolean constitutionSave, boolean intelligenceSave, boolean wisdomSave, boolean charismaSave) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.speed = speed;
        this.hitpoints = hitpoints;
        this.initiative = initiative;
        this.passive_perception = passive;
        this.strengthSave = strengthSave;
        this.dexteritySave = dexteritySave;
        this.constitutionSave = constitutionSave;
        this.intelligenceSave = intelligenceSave;
        this.wisdomSave = wisdomSave;
        this.charismaSave = charismaSave;
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
        return temp + this.strength + "," + this.dexterity + "," + this.constitution + "," + this.intelligence + "," + this.wisdom + "," + this.charisma + "," + this.speed+ "," + this.hitpoints+ "," + this.initiative + "," + this.passive_perception + "," + this.strengthSave + "," + this.dexteritySave + "," + this.constitutionSave + "," + this.intelligenceSave + "," + this.wisdomSave+ "," + this.charismaSave;
    }

    public boolean isStrengthSave() {
        return strengthSave;
    }

    public void setStrengthSave(boolean strengthSave) {
        this.strengthSave = strengthSave;
    }

    public boolean isDexteritySave() {
        return dexteritySave;
    }

    public void setDexteritySave(boolean dexteritySave) {
        this.dexteritySave = dexteritySave;
    }

    public boolean isConstitutionSave() {
        return constitutionSave;
    }

    public void setConstitutionSave(boolean constitutionSave) {
        this.constitutionSave = constitutionSave;
    }

    public boolean isIntelligenceSave() {
        return intelligenceSave;
    }

    public void setIntelligenceSave(boolean intelligenceSave) {
        this.intelligenceSave = intelligenceSave;
    }

    public boolean isWisdomSave() {
        return wisdomSave;
    }

    public void setWisdomSave(boolean wisdomSave) {
        this.wisdomSave = wisdomSave;
    }

    public boolean isCharismaSave() {
        return charismaSave;
    }

    public void setCharismaSave(boolean charismaSave) {
        this.charismaSave = charismaSave;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

}
