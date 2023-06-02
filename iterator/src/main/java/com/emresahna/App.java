package com.emresahna;

public class App {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(new User("John"));
        userRepository.addUser(new User("Doe"));
        userRepository.addUser(new User("Jane"));
        userRepository.addUser(new User("Doe"));

        Iterator<User> iterator = userRepository.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
