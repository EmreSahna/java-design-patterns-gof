package com.emresahna;

import java.util.Stack;

class TableManager {
    private final Stack<TableMemento> mementos;

    public TableManager() {
        mementos = new Stack<>();
    }

    public void addMemento(TableMemento memento) {
        mementos.push(memento);
    }

    public TableMemento getMemento() {
        return mementos.pop();
    }
}