package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Airport {
    private static final Logger logger = LoggerFactory.getLogger(Airport.class);
    private Request request;

    public Airport(Request request) {
        this.request = request;
    }

    public void check(String name) {
        if (request.handle(name)) {
            logger.info("Approved.");
        } else {
            logger.info("Rejected.");
        }
    }
}
