package com.emresahna;

public class Square extends Shape {
    public Square() {
        this.name = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square drawn");
    }
}
