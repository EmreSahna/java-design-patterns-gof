package com.emresahna;

public class Jedi {
    private Movement movement;

    public void doMovement() {
        movement.breakWall();
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }
}
