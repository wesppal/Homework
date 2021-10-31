package by.overone;


import by.overone.game.GameField;
import by.overone.game.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a;

        while (true) {
            System.out.print("Your step - ");
            if (IsNumeric.isInt(a = sc.nextLine())) {
                User.step(Integer.parseInt(a));
                GameField.printField();
            }else{
                System.out.println("Sorry, you didn't enter a number.");
            }
        }
    }
}
