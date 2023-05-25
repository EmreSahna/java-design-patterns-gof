package com.emresahna;

public class SUVFactory implements CarFactory {
    @Override
    public Car create() {
        return new Car("SUV");
    }
}
