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

    public static boolean gameOver() {
        boolean bool = false;
        if ((GameField.fieldForGame.get(4).figure == figureAI)) {
            if ((GameField.fieldForGame.get(4).figure == GameField.fieldForGame.get(1).figure)
                    && ((GameField.fieldForGame.get(4).figure)==(GameField.fieldForGame.get(7).figure))) {
                bool = true;
            }


            if ((GameField.fieldForGame.get(4).figure == GameField.fieldForGame.get(3).figure)
                    && ((GameField.fieldForGame.get(4).figure)==(GameField.fieldForGame.get(5).figure))) {
                bool = true;
            }


            if ((GameField.fieldForGame.get(4).figure == GameField.fieldForGame.get(0).figure)
                    && ((GameField.fieldForGame.get(4).figure)==(GameField.fieldForGame.get(8).figure))) {
                bool = true;
            }


            if ((GameField.fieldForGame.get(4).figure == GameField.fieldForGame.get(2).figure)
                    && ((GameField.fieldForGame.get(4).figure)==(GameField.fieldForGame.get(6).figure))) {
                bool = true;
            }
        }


        if ((GameField.fieldForGame.get(0).figure == figureAI)) {
            if ((GameField.fieldForGame.get(0).figure == GameField.fieldForGame.get(3).figure)
                    && ((GameField.fieldForGame.get(0).figure)==(GameField.fieldForGame.get(6).figure))) {
                bool = true;
            }

            if ((GameField.fieldForGame.get(0).figure == GameField.fieldForGame.get(1).figure)
                    && ((GameField.fieldForGame.get(0).figure)==(GameField.fieldForGame.get(2).figure))) {
                bool = true;
            }
        }

        if ((GameField.fieldForGame.get(8).figure == figureAI)) {
            if ((GameField.fieldForGame.get(8).figure == GameField.fieldForGame.get(6).figure)
                    && ((GameField.fieldForGame.get(8).figure)==(GameField.fieldForGame.get(7).figure))) {
                bool = true;
            }

            if ((GameField.fieldForGame.get(8).figure == GameField.fieldForGame.get(2).figure)
                    && ((GameField.fieldForGame.get(8).figure)==(GameField.fieldForGame.get(5).figure))) {
                bool = true;
            }
        }
        return bool;
    }
}
