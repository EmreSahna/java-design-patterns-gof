package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AccountNumberCheck {
    private static final Logger logger = LoggerFactory.getLogger(AccountNumberCheck.class);

    public boolean accountActive(int accountNumberToCheck, Database database) {
        logger.info("Hesap numarası kontrol ediliyor...");
        return database.accountActive(accountNumberToCheck);
    }
}