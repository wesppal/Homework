package by.overone.game;


import java.util.Random;

public class Ai {

    private static char figureAI = 'O';

    public static void stepByEasyAi() {
        Random random = new Random();
        int stepAi = random.nextInt(GameField.fieldEmpty.size());
        int indexCell = GameField.fieldEmpty.get(stepAi).index;
        GameField.fieldForGame.get(indexCell).figure = figureAI;
        GameField.fieldEmpty.remove(stepAi);
    }
}
