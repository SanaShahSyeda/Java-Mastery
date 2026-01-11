package Streams;

import java.util.List;
import java.util.stream.Stream;

public class streams {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "C", "D", "E");
        Stream<String> nameStream = names.stream();
        System.out.println(nameStream.count());
        // Uncommenting the below line will cause an IllegalStateException
        // System.out.println(nameStream.count());

        List<Integer> numbers = List.of(1, 2, 5, 6, 4, 8, 10, 9);
        Stream<Integer> numberStream = numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 2);
        numberStream.forEach(System.out::println);
    }
}
