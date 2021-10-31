package by.overone.game;


public class User {
    private static char figureUser = 'X';

    public static void step(int cellNumber) {
        if ((GameField.fieldForGame[cellNumber] != 'O') && (GameField.fieldForGame[cellNumber] != figureUser)) {
            GameField.step(cellNumber, figureUser);
            Ai.stepByEasyAi();
        } else {
            System.out.println("Sorry, this cage is busy. Choose another one.");
        }


    }


}
