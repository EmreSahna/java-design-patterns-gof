package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        var store = new Store();
        var notificationService = store.getNotificationServer();

        var mobileNotification1 = new MobileNotification("555-555-5555");
        var mobileNotification2 = new MobileNotification("555-555-5556");

        var emailNotification1 = new EmailNotification("testuser_1@test.com");
        var emailNotification2 = new EmailNotification("testuser_2@test.com");

        notificationService.subscribe(Event.UPDATE, mobileNotification1);
        notificationService.subscribe(Event.UPDATE, mobileNotification2);
        notificationService.subscribe(Event.UPDATE, emailNotification1);
        notificationService.subscribe(Event.UPDATE, emailNotification2);

        notificationService.subscribe(Event.SPECIAL_SALE_FOR_MOBILE, mobileNotification1);
        notificationService.subscribe(Event.SPECIAL_SALE_FOR_MOBILE, mobileNotification2);

        notificationService.subscribe(Event.SPECIAL_SALE_FOR_WEB, emailNotification1);
        notificationService.subscribe(Event.SPECIAL_SALE_FOR_WEB, emailNotification2);

        store.applicationUpdated();
        logger.info("--------------------------------------------------");

        notificationService.unsubscribe(Event.UPDATE, mobileNotification1);
        notificationService.unsubscribe(Event.UPDATE, emailNotification1);

        store.applicationUpdated();
        logger.info("--------------------------------------------------");


        store.specialSaleForMobile();
        logger.info("--------------------------------------------------");

        store.specialSaleForWeb();
        logger.info("--------------------------------------------------");
    }
}