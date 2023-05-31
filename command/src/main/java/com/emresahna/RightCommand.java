package com.emresahna;

public class RightCommand implements Command {
    private Position position;

    public RightCommand(Position position) {
        this.position = position;
    }

    public void execute() {
        position.right();
    }
}
