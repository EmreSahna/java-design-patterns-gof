package com.emresahna;

public class CoupeFactory implements CarFactory {
    @Override
    public Car create() {
        return new Car("Coupe");
    }
}
