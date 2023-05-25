package com.emresahna;

public class SedanFactory implements CarFactory {
    @Override
    public Car create() {
        return new Car("Sedan");
    }
}
