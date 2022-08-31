package com.example.dndcharacterorganizer;

public class Proficiency {

    private String name;
    //For storing if the proficiency is doubled
    int factor;
    private String description;

    public Proficiency(String name, int factor, String description) {
        this.name = name;
        this.factor = factor;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return name + ";" + factor + ";" + description;
    }
}
