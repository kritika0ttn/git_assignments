package java_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q6 {
    public static  void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);

        intList.stream().filter(e->e>7).findAny().stream()
                .mapMulti((number,consumer)->IntStream.rangeClosed(1,10)
                .forEach(e->consumer.accept(e*number)))
                .forEach(System.out::println);

    }
}
