package com.emresahna;

public class App {
    public static void main(String[] args) {
        Object garbageObject = new GarbageObject();
        Force jedi = new Jedi(garbageObject);

        jedi.move(1, 2);
        garbageObject.status();

        jedi.move(3, 4);
        garbageObject.status();
    }
}
