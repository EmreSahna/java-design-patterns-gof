package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Position {
    private static final Logger logger = LoggerFactory.getLogger(Position.class);

    private double x;
    private double y;
    private double sensitivity;

    public Position(double x, double y, double sensitivity) {
        this.x = x;
        this.y = y;
        this.sensitivity = sensitivity;
    }

    public void up() {
        y += sensitivity;
        print();
    }

    public void down() {
        y -= sensitivity;
        print();
    }

    public void left() {
        x -= sensitivity;
        print();
    }

    public void right() {
        x += sensitivity;
        print();
    }

    public void print() {
        logger.info("x: {}, y: {}", x, y);
    }
}
