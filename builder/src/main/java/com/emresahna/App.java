package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Home home = new Home.Builder()
                .gardenType(GardenType.BOG_GARDEN)
                .roofColor(Color.Black)
                .numberOfBedrooms(3)
                .wallColor(Color.White)
                .build();
        logger.info(home.toString());

        Home home2 = new Home.Builder()
                .gardenType(GardenType.BOG_GARDEN)
                .roofColor(Color.Black)
                .numberOfBedrooms(3)
                .build();
        logger.info(home2.toString());

        Home home3 = new Home.Builder()
                .gardenType(GardenType.BOG_GARDEN)
                .roofColor(Color.Black)
                .build();
        logger.info(home3.toString());
    }
}
