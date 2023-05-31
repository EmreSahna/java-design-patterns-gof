package com.emresahna;

public class UpCommand implements Command {
    private Position position;

    public UpCommand(Position position) {
        this.position = position;
    }

    public void execute() {
        position.up();
    }
}
