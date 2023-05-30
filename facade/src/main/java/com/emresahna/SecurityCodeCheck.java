package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SecurityCodeCheck {
    private static final Logger logger = LoggerFactory.getLogger(SecurityCodeCheck.class);

    public boolean isCodeCorrect(int securityCodeToCheck, int accountNumber,Database database) {
        logger.info("Güvenlik kodu kontrol ediliyor...");
        return database.securityCodeCorrect(securityCodeToCheck, accountNumber);
    }
}