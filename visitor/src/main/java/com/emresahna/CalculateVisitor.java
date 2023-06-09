package com.emresahna;

public class CalculateVisitor implements Visitor {
    public void calculateAreas(Shape... shape) {
        for(Shape v : shape) {
            v.accept(this);
        }
    }

    @Override
    public void visit(Rectangle rectangle) {
        rectangle.calculateArea();
    }

    @Override
    public void visit(Square square) {
        square.calculateArea();
    }
}
