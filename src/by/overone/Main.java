package by.overone;


import by.overone.game.GameField;
import by.overone.game.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;

        while(true) {
            System.out.print("Your step - ");
            a = sc.nextInt();
            User.step(a);
            GameField.printField();
        }

    }
}
