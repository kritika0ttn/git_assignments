package java_9;


import java.util.stream.IntStream;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("---normal ranged---");
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("---Closed Ranged---");
        IntStream.rangeClosed(1,9).forEach(System.out::println);
    }
}
