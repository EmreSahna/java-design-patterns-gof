package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {
    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void calculateArea() {
        logger.info("Calculated rectangle area is {}", x * y);
    }
}