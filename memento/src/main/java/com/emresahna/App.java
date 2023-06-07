package com.emresahna;

public class App {
    public static void main(String[] args) {
        TableManager manager = new TableManager();
        Table table = new Table();

        table.addCell(0, 0, "A");
        table.addCell(0, 1, "B");
        table.addCell(1, 0, "C");
        table.addCell(1, 1, "D");
        table.showTable();

        manager.addMemento(table.save());

        table.addCell(0, 0, "X");
        table.addCell(1, 1, "Y");
        table.showTable();

        manager.addMemento(table.save());

        table.addCell(0, 0, "Z");
        table.addCell(1, 1, "W");
        table.showTable();

        table.restore(manager.getMemento());
        table.showTable();

        table.restore(manager.getMemento());
        table.showTable();
    }
}