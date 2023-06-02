package com.emresahna;

public class UserIterator implements Iterator<User> {
    private User[] users;
    private int index;

    public UserIterator(User[] users) {
        this.users = users;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(users[index] != null)
            return true;
        return false;
    }

    @Override
    public User next() {
        return users[index++];
    }
}
