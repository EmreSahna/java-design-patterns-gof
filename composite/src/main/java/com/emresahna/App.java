package com.emresahna;

public class App {
    public static void main(String[] args) {
        Container container = new Container("Alibaba's Container");

        Box joshsBox = new Box("Josh's Box");
        joshsBox.add(
                new Product("Phone"),
                new Product("Drone"),
                new Product("Laptop")
        );

        Box giftBox = new Box("Gift Box");
        giftBox.add(
                new Product("Chocolate"),
                new Product("Flower")
        );

        Box janesBox = new Box("Jane's Box");
        janesBox.add(
                new Product("Book"),
                new Product("Pen"),
                new Product("Notebook"),
                giftBox
        );

        Product car = new Product("Car");

        container.add(
                joshsBox,
                janesBox,
                car
        );

        container.display();
    }
}
