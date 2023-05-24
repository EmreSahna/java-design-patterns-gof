package com.emresahna;

public class CarFactory {
    public static Car getCar(String type) {
        if (type.equals("Coupe")) {
            return new Coupe();
        } else if (type.equals("SUV")) {
            return new SUV();
        } else if (type.equals("Sedan")) {
            return new Sedan();
        }
        return null;
    }
}
