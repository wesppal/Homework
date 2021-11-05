package by.overone;


import by.overone.game.Ai;
import by.overone.game.GameField;
import by.overone.game.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a;
        GameField.printHeld();

        while (true) {
            System.out.print("Your step - ");
            if (IsNumeric.isInt(a = sc.nextLine())) {
                User.step(Integer.parseInt(a));
                GameField.printField();
            } else {
                System.out.println("Sorry, you didn't enter a number.");
            }
            if (Ai.gameOver()) {
                System.out.println("Game Over. You lose.");
                System.out.println("Do you want to try again? 0 - No; 1 - Yes;");
                a = sc.nextLine();
                if (a.contains("1")) {
                    GameField.clearField();
                    continue;
                }
                break;
            }
            if (User.youWon()) {
                System.out.println("Congratulation. You won!");
                System.out.println("Do you want to try again? 0 - No; 1 - Yes;");
                a = sc.nextLine();
                if (a.contains("1")) {
                    GameField.clearField();
                    continue;
                }
                break;
            }
        }

    }
}
