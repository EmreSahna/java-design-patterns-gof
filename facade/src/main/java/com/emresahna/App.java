package com.emresahna;

public class App {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade(12345678, 1234);
        bankFacade.withdrawCash(5000);
        bankFacade.depositCash(100);
    }
}