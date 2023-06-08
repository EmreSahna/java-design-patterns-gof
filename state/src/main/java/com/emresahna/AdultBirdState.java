package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdultBirdState extends State {
    private static final Logger logger = LoggerFactory.getLogger(AdultBirdState.class);

    public AdultBirdState(Bird bird) {
        super(bird);
        logger.info("Adult bird state is created.");
    }

    @Override
    public void grow() {
        logger.info("Max level is reached.");
    }
}
