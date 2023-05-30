package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FundsCheck {
    private static final Logger logger = LoggerFactory.getLogger(FundsCheck.class);

    public boolean hasEnoughMoney(double amount, int accountNumber, Database database) {
        logger.info("Hesap bakiyesi kontrol ediliyor...");
        if (database.getAccountBalance(accountNumber).doubleValue() >= amount) {
            return true;
        } else {
            return false;
        }
    }

    public void decreaseBalance(double amount, int accountNumber, Database database) {
        logger.info("Hesap bakiyesi azaltılıyor...");
        database.decreaseBalance(amount, accountNumber);
    }

    public void increaseBalance(double amount, int accountNumber, Database database) {
        logger.info("Hesap bakiyesi arttırılıyor...");
        database.increaseBalance(amount, accountNumber);
    }

    public double getAccountBalance(int accountNumber, Database database) {
        return database.getAccountBalance(accountNumber).doubleValue();
    }
}