package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Coffee coffee = new Arabica();
        logger.info(coffee.getDescription());

        Coffee milkCoffee = new MilkCoffee(coffee);
        logger.info(milkCoffee.getDescription());

        Coffee hazelnutCoffee = new HazelnutCoffee(coffee);
        logger.info(hazelnutCoffee.getDescription());

        Coffee milkHazelnutCoffee = new MilkCoffee(hazelnutCoffee);
        logger.info(milkHazelnutCoffee.getDescription());
    }
}
