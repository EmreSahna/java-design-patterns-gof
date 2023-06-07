package com.emresahna;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

class Table {
    private static final Logger logger = LoggerFactory.getLogger(Table.class);
    private List<List<String>> table_version;

    public Table() {
        table_version = new ArrayList<>();
    }

    public void addCell(int row, int column, String value) {
        if (table_version.size() <= row) {
            table_version.add(new ArrayList<>());
        }
        List<String> cells = table_version.get(row);
        if (cells.size() <= column) {
            for (int i = cells.size(); i <= column; i++) {
                cells.add("");
            }
        }
        cells.set(column, value);
    }

    public void showTable() {
        for (List<String> row : table_version) {
            for (String cell : row) {
                logger.info(cell + "\t");
            }
            logger.info("\n");
        }
        logger.info("\n");
    }

    public TableMemento save() {
        return new TableMemento(table_version);
    }

    public void restore(TableMemento memento) {
        table_version = memento.getTable_version();
    }
}
