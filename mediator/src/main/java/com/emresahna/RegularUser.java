package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegularUser extends User {
    private static final Logger logger = LoggerFactory.getLogger(RegularUser.class);
    public RegularUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        logger.info("[Regular] " + this.name + " sent: " + message);
        this.mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        logger.info("[Regular] " + this.name + " received: " + message);
    }
}
