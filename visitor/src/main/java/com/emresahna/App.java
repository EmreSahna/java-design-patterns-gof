package com.emresahna;

public class App {
    public static void main(String[] args) {
        CalculateVisitor calculateVisitor = new CalculateVisitor();
        calculateVisitor.calculateAreas(
                new Rectangle(10,15),
                new Square(5),
                new Rectangle(20,30),
                new Square(10)
        );
    }
}