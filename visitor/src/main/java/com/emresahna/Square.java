package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {
    private static final Logger logger = LoggerFactory.getLogger(Square.class);
    private int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public void calculateArea() {
        logger.info("Calculated square area is {}", x * x);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
