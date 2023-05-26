package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;

public class Box implements Component {
    private static final Logger logger = LoggerFactory.getLogger(Box.class);
    private String name;
    private List<Component> components = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void add(Component... components) {
        for (Component component : components) {
            this.components.add(component);
        }
    }

    @Override
    public void display() {
        logger.info("Box {} displayed.", name);
        for (Component component : components) {
            component.display();
        }
    }
}
