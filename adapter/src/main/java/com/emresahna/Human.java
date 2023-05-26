package com.emresahna;

public class Human implements Speakable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "Hello! My name is " + this.name + ".";
    }
}
