package by.overone.homeworks;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> positive = x -> x >= 0;
        Integer[] arr = {2,5,-5,-3,2,0,-5,-6,-7,22};
        Arrays.stream(arr).filter(positive).forEach(System.out::println);
    }
}
