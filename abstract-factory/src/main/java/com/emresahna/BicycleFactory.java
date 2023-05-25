package com.emresahna;

public class BicycleFactory extends AbstractVehicleFactory {
    @Override
    Vehicle create(String name) {
        if (name.equals("Mountain")) {
            return new MountainBicycle();
        } else if (name.equals("Road")) {
            return new RoadBicycle();
        } else {
            return null;
        }
    }
}
