package com.emresahna;

public class App {
    public static void main(String[] args) {
        Request documentValidation = new DocumentValidation();
        documentValidation.setNextRequest(new RecordValidation()).setNextRequest(new BankValidation());

        Airport IGA = new Airport(documentValidation);

        IGA.check("John");
        IGA.check("Jack");
        IGA.check("Jane");
    }
}
