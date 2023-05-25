package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Shape square = ShapeCache.getShape("square");
        Shape square2 = ShapeCache.getShape("square");

        logger.info("square == square2: {}", square == square2);
        logger.info("square.equals(square2): {}", square.equals(square2));

        Shape rectangle = ShapeCache.getShape("rectangle");
        Shape rectangle2 = ShapeCache.getShape("rectangle");

        logger.info("rectangle == rectangle2: {}", rectangle == rectangle2);
        logger.info("rectangle.equals(rectangle2): {}", rectangle.equals(rectangle2));
    }
}
