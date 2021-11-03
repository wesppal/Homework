package by.overone;


import by.overone.game.Ai;
import by.overone.game.GameField;
import by.overone.game.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a;
        boolean bool = true;

        while (bool) {
            System.out.print("Your step - ");
            if (IsNumeric.isInt(a = sc.nextLine())) {
                User.step(Integer.parseInt(a));
                GameField.printField();
            } else {
                System.out.println("Sorry, you didn't enter a number.");
            }
            if (Ai.gameOver()) {
                System.out.println("Game Over. You lose.");
                break;
            }
            if (User.youWon()) {
                System.out.println("Congratulation. You won!");
                break;
            }
        }
    }
}
