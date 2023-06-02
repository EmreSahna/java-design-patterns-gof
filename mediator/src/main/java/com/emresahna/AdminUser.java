package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminUser extends User {
    private static final Logger logger = LoggerFactory.getLogger(AdminUser.class);
    public AdminUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        logger.info("[Admin] " + this.name + " sent: " + message);
        this.mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        logger.info("[Admin] " + this.name + " received: " + message);
    }
}
