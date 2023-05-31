package com.emresahna;

public class Game {
    private Command up;
    private Command down;
    private Command left;
    private Command right;

    public Game(Command up, Command down, Command left, Command right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void pressUp() {
        up.execute();
    }

    public void pressDown() {
        down.execute();
    }

    public void pressLeft() {
        left.execute();
    }

    public void pressRight() {
        right.execute();
    }
}
