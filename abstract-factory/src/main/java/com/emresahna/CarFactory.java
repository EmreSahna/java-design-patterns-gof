package com.emresahna;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    Vehicle create(String name) {
        if (name.equals("Sedan")) {
            return new SedanCar();
        } else if (name.equals("Coupe")) {
            return new CoupeCar();
        } else {
            return null;
        }
    }
}
