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
}
