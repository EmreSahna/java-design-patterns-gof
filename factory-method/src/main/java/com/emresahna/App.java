package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        CarFactory carFactory1 = new CoupeFactory();
        Car coupe = carFactory1.create();
        logger.info(coupe.getName());

        CarFactory carFactory2 = new SUVFactory();
        Car suv = carFactory2.create();
        logger.info(suv.getName());

        CarFactory carFactory3 = new SedanFactory();
        Car sedan = carFactory3.create();
        logger.info(sedan.getName());
    }
}
