package com.example.dndcharacterorganizer;

public class Ability {
    private boolean cooldown;
    private boolean used;
    private String name;
    private String description;

    public Ability(String name,boolean cooldown,boolean used, String description){
        this.name = name;
        this.cooldown = cooldown;
        this.used = used;
        this.description = description;
    }

    public Ability(String name,String description){
        this.name = name;
        this.description = description;
    }

    public boolean isCooldown() {
        return cooldown;
    }

    public boolean isUsed() {
        return used;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return this.name + "," + this.cooldown + "," + this.used + "," + this.description;
    }
}
