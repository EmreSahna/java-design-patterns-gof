package com.emresahna;

public class Bird {
    private State state;

    public Bird() {
        this.state = new EggState(this);
    }

    public void timePasses() {
        state.grow();
    }

    public void setState(State state) {
        this.state = state;
    }
}
