package com.example.dndcharacterorganizer;

public class Skill {
    private String name;
    //Factor is for storing if the proficiency is doubled
    private int factor;
    private String description;

    public Skill(String name, int factor, String description){
        this.name = name;
        this.factor = factor;
        this.description = description;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getFactor() {
        return factor;
    }

    public String getDescription() {
        return description;
    }
}
