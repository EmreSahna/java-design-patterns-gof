package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotification implements Notification {
    private final static Logger logger = LoggerFactory.getLogger(EmailNotification.class);
    private final String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(Event event) {
        logger.info("Email notification has been sent to " + email + " for " + event + " event. ");
    }
}
