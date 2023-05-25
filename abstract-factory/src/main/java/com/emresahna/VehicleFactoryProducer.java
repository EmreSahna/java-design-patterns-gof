package com.emresahna;

public class VehicleFactoryProducer {
    public static AbstractVehicleFactory getFactory(String type) {
        if (type.equals("car")) {
            return new CarFactory();
        } else if (type.equals("bicycle")) {
            return new BicycleFactory();
        } else {
            return null;
        }
    }
}
