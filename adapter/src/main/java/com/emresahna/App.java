package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Council council = new Council();

        Human human = new Human("Joseph");
        Alien alien = new Alien("Klaatu");
        logger.info(council.speak(human));
        //logger.info(council.speak(alien)); // This will not work.

        AlienAdapter adaptedAlien = new AlienAdapter(alien);
        logger.info(council.speak(adaptedAlien));
    }
}
