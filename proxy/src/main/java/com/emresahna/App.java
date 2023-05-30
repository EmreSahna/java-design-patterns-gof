package com.emresahna;

public class App {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectTo("www.instagram.com");
        internet.connectTo("www.github.com");

        internet.connectTo("www.github.com");
    }
}
