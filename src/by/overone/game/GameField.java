package by.overone.game;


public class GameField {


    static char[] fieldForGame = {' ', ' ', ' ',
            ' ', ' ', ' ',
            ' ', ' ', ' '};

    private static char[] fieldHelp = {'0', '1', '2',
            '3', '4', '5',
            '6', '7', '8'};


//    public static char[] step(int cellNumber, char figure) {
//        fieldForGame[cellNumber] = figure;
//        return fieldForGame;
//    }


    public static void step(int cellNumber, char figure) {
        fieldForGame[cellNumber] = figure;
    }

//    public static char[] clear() {
//        for (int i = 0; i < fieldForGame.length; i++) {
//            fieldForGame[i] = ' ';
//        }
//        return fieldForGame;
//    }

    public static void clear() {
        for (int i = 0; i < fieldForGame.length; i++) {
            fieldForGame[i] = ' ';
        }
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
        System.out.println("\n");
    }

    public static void printHelpField() {
        System.out.print("\n" + "Help by cell numbers.\n\n" + "|");
        int count = 0;

        for (int i = 0; i < fieldHelp.length; i++) {
            count++;

            if (count == 3) {
                System.out.println(fieldHelp[i] + "|");
                count = 0;

                if (i != fieldHelp.length - 1) {
                    System.out.print("|");
                }

            } else {
                System.out.print(fieldHelp[i] + "|");
            }
        }

        System.out.println("____________________\n");

    }
}