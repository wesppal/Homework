package by.overone.homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> positive = x -> x >= 0;
        Integer[] arr = {2, 5, -5, -3, 2, 0, -5, -6, -7, 22};
        Arrays.stream(arr).filter(positive).forEach(System.out::println);
        System.out.println();

        UnaryOperator<Integer> pow = x -> x * x;
//        Arrays.stream(arr).forEach(x -> System.out.println(pow.apply(x)));
        Arrays.stream(arr).map(x -> pow.apply(x)).forEach(System.out::println);
        System.out.println();

        List<String> str = new ArrayList<>();
        BinaryOperator<String> twoStr = (x, y) -> x + y;

        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        for (int i = 1; i < str.size(); i++) {
            System.out.println(twoStr.apply(str.get(i - 1), str.get(i)));
        }


    }
}
