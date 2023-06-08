package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BabyBirdState extends State {
    private static final Logger logger = LoggerFactory.getLogger(BabyBirdState.class);

    public BabyBirdState(Bird bird) {
        super(bird);
        logger.info("Baby bird state is created.");
    }

    @Override
    public void grow() {
        bird.setState(new AdultBirdState(bird));
    }
}
