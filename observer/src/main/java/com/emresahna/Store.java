package com.emresahna;

public class Store {
    private final NotificationService notificationService;

    public Store() {
        this.notificationService = new NotificationService();
    }

    public void applicationUpdated() {
        notificationService.notifySubscribers(Event.UPDATE);
    }

    public void specialSaleForWeb() {
        notificationService.notifySubscribers(Event.SPECIAL_SALE_FOR_WEB);
    }

    public void specialSaleForMobile() {
        notificationService.notifySubscribers(Event.SPECIAL_SALE_FOR_MOBILE);
    }

    public NotificationService getNotificationServer() {
        return notificationService;
    }
}