package by.overone.game;



public class User {
    private static char figureUser = 'X';

    public static void step (int cellNumber) {
        GameField.step(cellNumber,figureUser);
        Ai.stepByEasyAi();
    }


}
