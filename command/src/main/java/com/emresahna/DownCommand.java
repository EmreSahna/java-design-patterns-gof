package com.emresahna;

public class DownCommand implements Command {
    private Position position;

    public DownCommand(Position position) {
        this.position = position;
    }

    public void execute() {
        position.down();
    }
}
