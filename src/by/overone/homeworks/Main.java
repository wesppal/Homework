package by.overone.homeworks;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 2;
//
//        try {
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Division by zero/ sorry");
//        }
//        finally {
//            System.out.println("Goodbye");
//        }
try {

    print();
}
catch (Exception e){
    System.out.println("it's okay");
}


    }

    public static void print () throws  Exception{
        int[] array = {1, 2, 0, 4, 5};
        int length = 6;

        for (int i = 0; i < length; i++) {
            try {
                System.out.println(10 / array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ai yai yai, vihod za predeli");
            } catch (ArithmeticException e2) {
                System.out.println("delenie na nol");
                throw new Exception();
            }
        }


    }
}
