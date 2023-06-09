package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PdfFile extends File {
    private static final Logger logger = LoggerFactory.getLogger(PdfFile.class);
    public PdfFile(String fileName) {
        super(fileName);
    }

    @Override
    public void open() {
        logger.info("Opening pdf file: " + fileName);
    }

    @Override
    public void parse() {
        logger.info("Parsing pdf file: " + fileName);
    }

    @Override
    public void close() {
        logger.info("Closing pdf file: " + fileName);
    }
}
