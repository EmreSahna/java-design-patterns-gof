package com.emresahna;

public abstract class State {
    protected Bird bird;

    public State(Bird bird) {
        this.bird = bird;
    }

    public abstract void grow();
}
