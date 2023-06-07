package com.emresahna;

import java.util.ArrayList;
import java.util.List;

class TableMemento {
    private final List<List<String>> table_version;

    public TableMemento(List<List<String>> table_version) {
        this.table_version = new ArrayList<>();
        for (List<String> row : table_version) {
            this.table_version.add(new ArrayList<>(row));
        }
    }

    public List<List<String>> getTable_version() {
        return table_version;
    }
}