package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private String name;
    private int accountNumber;
    private BigDecimal balance;
    private int securityCode;

    public User(String name, int accountNumber, BigDecimal balance, int securityCode) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.securityCode = securityCode;
        logger.info("Yeni kullanıcı oluşturuldu. Kullanıcı adı: {}, hesap numarası: {}, bakiye: {} TL, güvenlik kodu: {}", name, accountNumber, balance, securityCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}
