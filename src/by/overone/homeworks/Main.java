package by.overone.homeworks;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero/ sorry");
        }
        finally {
            System.out.println("Goodbye");
        }
    }
}
