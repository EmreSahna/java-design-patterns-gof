package com.emresahna;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class BankDatabase implements Database {
    private static List<User> users = new ArrayList<>(){
        {
            add(new User("Emre",12345678, BigDecimal.valueOf(1000), 1234));
            add(new User("Ali",87654321, BigDecimal.valueOf(2000), 1234));
        }
    };

    @Override
    public boolean accountActive(int accountNumberToCheck) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumberToCheck) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean securityCodeCorrect(int securityCodeToCheck, int accountNumberCheck) {
        for (User user : users) {
            if (user.getSecurityCode() == securityCodeToCheck) {
                if(user.getAccountNumber() == accountNumberCheck) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public BigDecimal getAccountBalance(int accountNumber) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                return user.getBalance();
            }
        }
        return null;
    }

    @Override
    public void decreaseBalance(double amount, int accountNumber) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.setBalance(user.getBalance().subtract(BigDecimal.valueOf(amount)));
            }
        }
    }

    @Override
    public void increaseBalance(double amount, int accountNumber) {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.setBalance(user.getBalance().add(BigDecimal.valueOf(amount)));
            }
        }
    }
}
