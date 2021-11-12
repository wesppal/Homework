package by.overone.homeworks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data.outZodiac(0,0);
        Data.outZodiac(32,12);
        System.out.println("Enter your date of birth:");
        Scanner sc = new Scanner(System.in);
        int day, month;
        System.out.print("Day(format DD) - ");
        day = sc.nextInt();
        System.out.print("Month(format MM) - ");
        month = sc.nextInt();
        Data.outZodiac(day,month);
    }
}
