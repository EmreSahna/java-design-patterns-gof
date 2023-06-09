package com.emresahna;

public abstract class File {
    public String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void mine() {
        open();
        parse();
        close();
    }

    public abstract void open();
    public abstract void parse();
    public abstract void close();
}
