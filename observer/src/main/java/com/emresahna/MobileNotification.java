package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobileNotification implements Notification {
    private final static Logger logger = LoggerFactory.getLogger(MobileNotification.class);
    private final String phoneNumber;

    public MobileNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Event event) {
        logger.info("Mobile notification has been sent to " + phoneNumber + " for " + event + " event. ");
    }
}