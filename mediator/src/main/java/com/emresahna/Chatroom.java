package com.emresahna;

import java.util.ArrayList;
import java.util.List;

public class Chatroom implements Mediator {
    private List<User> users;

    public Chatroom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
