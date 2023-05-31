package com.emresahna;

public class App {
    public static double SENSITIVITY = 1;
    public static double START_X = 0;
    public static double START_Y = 0;

    public static void main(String[] args) {
        Position position = new Position(START_X, START_Y, SENSITIVITY);

        Command upCommand = new UpCommand(position);
        Command downCommand = new DownCommand(position);
        Command leftCommand = new LeftCommand(position);
        Command rightCommand = new RightCommand(position);

        Game game = new Game(upCommand, downCommand, leftCommand, rightCommand);

        game.pressUp();
        game.pressUp();
        game.pressRight();
        game.pressUp();
        game.pressDown();
        game.pressLeft();
        game.pressRight();
        game.pressRight();
        game.pressDown();
        game.pressLeft();
        game.pressLeft();
        game.pressDown();
        game.pressRight();
    }
}
