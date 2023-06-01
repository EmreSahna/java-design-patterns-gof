package com.emresahna;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Integer> variables;

    public Context() {
        this.variables = new HashMap<>();
    }

    public void setVariable(String name, int value) {
        variables.put(name, value);
    }

    public int getVariable(String name) {
        return variables.get(name);
    }
}
