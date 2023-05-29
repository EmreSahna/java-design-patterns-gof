package com.emresahna;

public class HazelnutCoffee extends CoffeeDecorator {
    public HazelnutCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nExtra: Hazelnut";
    }
}
