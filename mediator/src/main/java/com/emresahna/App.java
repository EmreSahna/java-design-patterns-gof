package com.emresahna;

public class App {
    public static void main(String[] args) {
        Mediator schoolChatGroup = new Chatroom();

        User adminUser = new AdminUser(schoolChatGroup, "Jack");
        User regularUser = new RegularUser(schoolChatGroup, "John");
        User regularUser2 = new RegularUser(schoolChatGroup, "Jane");

        schoolChatGroup.addUser(adminUser);
        schoolChatGroup.addUser(regularUser);
        schoolChatGroup.addUser(regularUser2);

        adminUser.send("Exams start next week!");
        regularUser.send("Ok, thanks for the info.");
        regularUser2.send("I'm not ready for the exams :(");
    }
}
