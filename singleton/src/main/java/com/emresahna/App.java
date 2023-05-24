package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Hero hero = Hero.getInstance();
        hero.setName("Batman");
        logger.info(hero.getName());

        Hero hero2 = Hero.getInstance();
        logger.info(hero2.getName());

        logger.info("hero == hero2: {}", hero == hero2);
    }
}
