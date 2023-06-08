package com.emresahna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<Event, List<Notification>> users;

    public NotificationService() {
        this.users = new HashMap<>();
        for (Event event : Event.values()) {
            users.put(event, new ArrayList<>());
        }
    }

    public void subscribe(Event event, Notification notification) {
        users.get(event).add(notification);
    }

    public void unsubscribe(Event event, Notification notification) {
        users.get(event).remove(notification);
    }

    public void notifySubscribers(Event event) {
        users.get(event).forEach(notification -> notification.update(event));
    }
}