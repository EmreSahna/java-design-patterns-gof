package com.emresahna;

public class Hero {
    private static Hero instance;
    private String name;

    private Hero() {
        this.name = "Default Name";
    }

    public static Hero getInstance() {
        if (instance == null) {
            instance = new Hero();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
