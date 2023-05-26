package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Product implements Component {
    private static final Logger logger = LoggerFactory.getLogger(Product.class);
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        logger.info("Product {} displayed.", name);
    }
}
