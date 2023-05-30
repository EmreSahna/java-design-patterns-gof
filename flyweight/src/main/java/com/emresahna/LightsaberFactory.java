package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.EnumMap;
import java.util.Map;

public class LightsaberFactory {
    private static final Logger logger = LoggerFactory.getLogger(LightsaberFactory.class);
    private static final Map<CrystalColor, Lightsaber> lightsaberMap = new EnumMap<>(CrystalColor.class);

    public LightsaberFactory() {
    }

    public Lightsaber getLightsaber(CrystalColor crystalColor) {
        Lightsaber lightsaber = lightsaberMap.get(crystalColor);

        if (lightsaber == null) {
            logger.info("Creating a new lightsaber with {} crystal",crystalColor);
            lightsaber = new Lightsaber(crystalColor);
            lightsaberMap.put(crystalColor, lightsaber);
        }

        return lightsaber;
    }

    public int getCreatedLightsaberCount(){
        return lightsaberMap.size();
    }
}
