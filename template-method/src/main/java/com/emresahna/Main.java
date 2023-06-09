package com.emresahna;

public class Main {
    public static void main(String[] args) {
        File csvFile = new CsvFile("cia_secret.csv");
        File pdfFile = new PdfFile("president_secret.pdf");

        csvFile.mine();
        pdfFile.mine();
    }
}