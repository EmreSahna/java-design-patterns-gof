package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static int JEDI_COUNT = 20;

    public static void main(String[] args) {
        LightsaberFactory factory = new LightsaberFactory();
        for (int i = 0; i < JEDI_COUNT; i++) {
            int random = (int) (Math.random() * CrystalColor.values().length);
            Lightsaber lightsaber = factory.getLightsaber(CrystalColor.values()[random]);
            logger.info("JEDI number {} trained with {} color lightsaber",i+1, lightsaber.getCrystalColor());
        }

        logger.info("{} lightsaber object created instead of {}", factory.getCreatedLightsaberCount(), JEDI_COUNT);
    }
}
