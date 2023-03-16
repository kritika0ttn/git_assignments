package java_9;

import java.util.List;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("---takeWhile---");

        intList.stream()
                .takeWhile(e -> e < 5)
                .forEach(System.out::println);

        System.out.println("---dropWhile---");

        intList.stream()
                .dropWhile(e->e<5)
                .forEach(System.out::println);
    }
}
