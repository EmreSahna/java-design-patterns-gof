package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CsvFile extends File {
    private static final Logger logger = LoggerFactory.getLogger(CsvFile.class);
    public CsvFile(String fileName) {
        super(fileName);
    }

    @Override
    public void open() {
        logger.info("Opening csv file: " + fileName);
    }

    @Override
    public void parse() {
        logger.info("Parsing csv file: " + fileName);
    }

    @Override
    public void close() {
        logger.info("Closing csv file: " + fileName);
    }
}
