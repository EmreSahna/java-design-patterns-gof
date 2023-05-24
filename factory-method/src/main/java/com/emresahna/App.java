package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Car car = CarFactory.getCar("Sedan");
        logger.info(car.start());

        car = CarFactory.getCar("SUV");
        logger.info(car.start());

        car = CarFactory.getCar("Coupe");
        logger.info(car.start());
    }
}
