package com.emresahna;

public class AlienAdapter implements Speakable {
    private Alien alien;

    public AlienAdapter(Alien alien) {
        this.alien = alien;
    }

    @Override
    public String speak() {
        return "Hello! My name is " + this.alien.getName() + ".";
    }
}
