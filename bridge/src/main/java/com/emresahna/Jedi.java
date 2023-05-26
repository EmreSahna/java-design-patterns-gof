package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jedi implements Force {
    private static final Logger logger = LoggerFactory.getLogger(Jedi.class);
    private Object object;

    public Jedi(Object object) {
        this.object = object;
    }

    @Override
    public void move(int x, int y) {
        logger.info("Jedi use the force!");
        object.moved(x, y);
    }
}
