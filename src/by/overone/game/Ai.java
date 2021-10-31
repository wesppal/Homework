package by.overone.game;

import java.util.Random;

public class Ai {
    private static char figureAI = 'O';

    public static void stepByEasyAi() {
        Random random = new Random();
        int stepAi = random.nextInt(8);
        while (true) {
            if (GameField.fieldForGame[stepAi] != 'X') {
                GameField.step(stepAi, figureAI);
                break;
            }
            stepAi = random.nextInt(8);
        }

    }
}
