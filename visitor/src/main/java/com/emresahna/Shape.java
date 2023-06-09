package com.emresahna;

public interface Shape {
    void calculateArea();
    void accept(Visitor visitor);
}
