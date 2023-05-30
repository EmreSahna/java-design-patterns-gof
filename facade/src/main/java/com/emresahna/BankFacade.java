package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class BankFacade {
    private static final Logger logger = LoggerFactory.getLogger(BankFacade.class);

    private int accountNumber;
    private int securityCode;

    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeCheck securityCodeCheck;
    private FundsCheck fundsCheck;
    private BankDatabase bankDatabase;

    public BankFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
        bankDatabase = new BankDatabase();
    }

    public void withdrawCash(double amount) {
        if (accountNumberCheck.accountActive(accountNumber, bankDatabase) && securityCodeCheck.isCodeCorrect(securityCode, accountNumber, bankDatabase) && fundsCheck.hasEnoughMoney(amount, accountNumber, bankDatabase)) {
            fundsCheck.decreaseBalance(amount, accountNumber, bankDatabase);
            logger.info("Para çekme işlemi başarılı. Mevcut bakiye: {} TL", fundsCheck.getAccountBalance(accountNumber, bankDatabase));
        } else {
            logger.error("Para çekme işlemi başarısız.");
        }
    }

    public void depositCash(double amount) {
        if (accountNumberCheck.accountActive(accountNumber, bankDatabase) && securityCodeCheck.isCodeCorrect(securityCode, accountNumber, bankDatabase)) {
            fundsCheck.increaseBalance(amount, accountNumber, bankDatabase);
            logger.info("Para yatırma işlemi başarılı. Mevcut bakiye: {} TL", fundsCheck.getAccountBalance(accountNumber, bankDatabase));
        } else {
            logger.error("Para yatırma işlemi başarısız.");
        }
    }
}
