package by.overone.homeworks;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> positive = x -> x >= 0;
        Integer[] arr = {2,5,-5,-3,2,0,-5,-6,-7,22};
        Arrays.stream(arr).filter(positive).forEach(System.out::println);

        UnaryOperator<Integer> pow = x -> x*x;
//        Arrays.stream(arr).forEach(x -> System.out.println(pow.apply(x)));
        Arrays.stream(arr).map(x -> pow.apply(x)).forEach(System.out::println);
    }
}
