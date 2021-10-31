package by.overone;


public class Field {


    private static char[] fieldForGame = {' ', ' ', ' ',
            ' ', ' ', ' ',
            ' ', ' ', ' '};


    public static char[] step(int cellNumber, char figure) {
        fieldForGame[cellNumber] = figure;
        return fieldForGame;
    }

    public static char[] clear() {
        for (int i = 0; i < fieldForGame.length; i++) {
            fieldForGame[i] = ' ';
        }
        return fieldForGame;
    }

    public static void printField() {
        System.out.print("|");
        int count = 0;

        for (int i = 0; i < fieldForGame.length; i++) {
            count++;

            if (count == 3) {
                System.out.println(fieldForGame[i] + "|");
                count = 0;

                if (i != fieldForGame.length - 1) {
                    System.out.print("|");
                }

            } else {
                System.out.print(fieldForGame[i] + "|");
            }

        }
    }
}