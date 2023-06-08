package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EggState extends State {
    private static final Logger logger = LoggerFactory.getLogger(EggState.class);

    public EggState(Bird bird) {
        super(bird);
        logger.info("Egg state is created.");
    }

    @Override
    public void grow() {
        bird.setState(new BabyBirdState(bird));
    }
}
