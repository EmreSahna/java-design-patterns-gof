package com.emresahna;

public class Rectangle extends Shape {
    public Rectangle() {
        this.name = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle drawn");
    }
}
