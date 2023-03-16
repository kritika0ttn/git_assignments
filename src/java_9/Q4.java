package java_9;

import java.util.stream.IntStream;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("---streams through itrators---");
        IntStream
                .iterate(0,i->i<=25, i->i+2)
                .forEach(System.out::println);
    }
}
