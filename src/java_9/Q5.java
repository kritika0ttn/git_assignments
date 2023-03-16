package java_9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("---ifPresentOrElse Example---");

        intList.stream()
                .filter(e->e>7).findFirst()
                .ifPresentOrElse(System.out::println,
                        ()-> System.out.println("value does not exist"));

        System.out.println("---.or Example---");
        System.out.println("values"+intList);


        intList.stream().filter(e->e>7)
                .findAny().or(()->Optional.of(-1)).ifPresentOrElse(System.out::println,
                        ()-> System.out.println("Value does not exist"));

        System.out.println("---orElseThrow Example---");

        intList.stream()
                .filter(e->e>18)
                .findFirst()
                .orElseThrow();

    }
}
