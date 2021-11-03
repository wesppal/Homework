package by.overone.game;

import java.util.ArrayList;
import java.util.List;

public class GameField {
    static int lengthField = 9;
    static List<Cell> fieldEmpty = new ArrayList<>();
    static List<Cell> fieldForGame = new ArrayList<>();

    static {
        for (int i = 0; i < lengthField; i++) {
            fieldForGame.add(new Cell());
            fieldEmpty.add(fieldForGame.get(i));
        }
    }


    public static List step(int cellNumber, char figure) {
        if ((cellNumber >= 0) && (cellNumber < lengthField)) {
            fieldForGame.get(cellNumber).figure = figure;

            for (Cell cell : fieldEmpty) {

                if (cell.index == cellNumber) {
                    fieldEmpty.remove(cell);
                    break;
                }
            }
        } else {
            System.out.println("Sorry, there is no given cell, choose another one.");
        }
        return fieldForGame;
    }


    public static void printField() {
        System.out.print("|");
        int count = 0;

        for (int i = 0; i < fieldForGame.size(); i++) {
            count++;

            if (count == 3) {
                System.out.println(fieldForGame.get(i).figure + "|");
                count = 0;

                if (i != fieldForGame.size() - 1) {
                    System.out.print("|");
                }

            } else {
                System.out.print(fieldForGame.get(i).figure + "|");
            }
        }
        System.out.println("\n");
    }

    public static void clearField() {
        for (int i = 0; i < lengthField; i++) {
            fieldForGame.add(new Cell());
            fieldEmpty.add(fieldForGame.get(i));
        }
    }
}
