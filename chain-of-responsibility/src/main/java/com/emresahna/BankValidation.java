package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BankValidation extends BaseRequest {
    private static final Logger logger = LoggerFactory.getLogger(BankValidation.class);
    private static Map<String, Integer> bankMap;

    static {
        bankMap = new HashMap<>();
        bankMap.put("John", 15000);
        bankMap.put("Jack", 3000);
    }

    @Override
    public boolean handle(String name) {
        if (bankMap.containsKey(name) && bankMap.get(name) > 10000) {
            logger.info("Bank validation is successful.");
            return handleNext(name);
        }
        logger.info("Bank validation is failed.");
        return false;
    }
}
