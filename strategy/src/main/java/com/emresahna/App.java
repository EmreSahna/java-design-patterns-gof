package com.emresahna;

public class App {
    public static void main(String[] args) {
        Jedi jedi = new Jedi();

        jedi.setMovement(new Lightsaber());
        jedi.doMovement();

        jedi.setMovement(new Force());
        jedi.doMovement();
    }
}