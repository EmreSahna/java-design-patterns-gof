package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        AbstractVehicleFactory carFactory = VehicleFactoryProducer.getFactory("car");
        Vehicle car = carFactory.create("Sedan");
        logger.info(car.start());

        Vehicle car2 = carFactory.create("Coupe");
        logger.info(car2.start());

        AbstractVehicleFactory bicycleFactory = VehicleFactoryProducer.getFactory("bicycle");
        Vehicle bicycle = bicycleFactory.create("Mountain");
        logger.info(bicycle.start());

        Vehicle bicycle2 = bicycleFactory.create("Road");
        logger.info(bicycle2.start());
    }
}
