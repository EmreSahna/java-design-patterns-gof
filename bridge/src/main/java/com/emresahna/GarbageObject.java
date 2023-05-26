package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GarbageObject implements Object{
    private static final Logger logger = LoggerFactory.getLogger(GarbageObject.class);

    private int x;
    private int y;

    public GarbageObject() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void moved(int x, int y) {
        this.x = x;
        this.y = y;
        logger.info("GarbageObject moved");
    }

    @Override
    public void status() {
        logger.info("GarbageObject at ({}, {})", x, y);
    }
}
