package com.emresahna;

public class UserRepository implements Iterable<User>{
    private static final int CAPACITY = 10;
    private User[] users;
    private int index;

    public UserRepository() {
        this.users = new User[CAPACITY];
        this.index = 0;
    }

    public void addUser(User user) {
        if(index < users.length) {
            users[index++] = user;
        }
    }

    @Override
    public Iterator<User> iterator() {
        return new UserIterator(users);
    }
}
