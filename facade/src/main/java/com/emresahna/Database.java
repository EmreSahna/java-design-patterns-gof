package com.emresahna;

import java.math.BigDecimal;

public interface Database {
    boolean accountActive(int accountNumberToCheck);
    boolean securityCodeCorrect(int securityCodeToCheck, int accountNumberCheck);
    BigDecimal getAccountBalance(int accountNumber);
    void decreaseBalance(double amount, int accountNumber);
    void increaseBalance(double amount, int accountNumber);
}
