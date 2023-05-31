package com.emresahna;

public class LeftCommand implements Command {
    private Position position;

    public LeftCommand(Position position) {
        this.position = position;
    }

    public void execute() {
        position.left();
    }
}
