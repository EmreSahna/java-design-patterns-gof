package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class RecordValidation extends BaseRequest {
    private static final Logger logger = LoggerFactory.getLogger(RecordValidation.class);
    private static Map<String, Boolean> recordMap;

    static {
        recordMap = new HashMap<>();
        recordMap.put("John", true);
        recordMap.put("Jack", false);
    }

    @Override
    public boolean handle(String name) {
        if (recordMap.containsKey(name) && recordMap.get(name)) {
            logger.info("Record validation is successful.");
            return handleNext(name);
        }
        logger.info("Record validation is failed.");
        return false;
    }
}
