package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class DocumentValidation extends BaseRequest {
    private static final Logger logger = LoggerFactory.getLogger(DocumentValidation.class);
    private static Map<String, Boolean> documentMap;

    static {
        documentMap = new HashMap<>();
        documentMap.put("John", true);
        documentMap.put("Jack", true);
    }

    @Override
    public boolean handle(String name) {
        if (documentMap.containsKey(name) && documentMap.get(name)) {
            logger.info("Document validation is successful.");
            return handleNext(name);
        }
        logger.info("Document validation is failed.");
        return false;
    }
}
