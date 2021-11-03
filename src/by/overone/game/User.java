package by.overone.game;


public class User {

    private static char figureUser = 'X';

    public static void step(int cellNumber) {
        if ((cellNumber >= 0) && (cellNumber < 9)) {

            for (Cell cell : GameField.fieldEmpty) {
                if (cell.index == cellNumber) {
                    GameField.fieldEmpty.remove(cell);
                    GameField.step(cellNumber, figureUser);

                    if (GameField.fieldEmpty.size() > 1) {
                        Ai.stepByEasyAi();
                    }

                    break;
                }
            }
        } else {
            System.out.println("Sorry, there is no given cell, choose another one.");
        }

        if (GameField.fieldForGame.get(cellNumber).figure != figureUser) {
            System.out.println("Sorry, this cage is busy. Choose another one.");
        }
    }


    public static boolean youWon() {
        boolean bool = false;
        if ((GameField.fieldForGame.get(4).figure == figureUser)) {
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


        if ((GameField.fieldForGame.get(0).figure == figureUser)) {
            if ((GameField.fieldForGame.get(0).figure == GameField.fieldForGame.get(3).figure)
                    && ((GameField.fieldForGame.get(0).figure)==(GameField.fieldForGame.get(6).figure))) {
                bool = true;
            }

            if ((GameField.fieldForGame.get(0).figure == GameField.fieldForGame.get(1).figure)
                    && ((GameField.fieldForGame.get(0).figure)==(GameField.fieldForGame.get(2).figure))) {
                bool = true;
            }
        }

        if ((GameField.fieldForGame.get(8).figure == figureUser)) {
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
