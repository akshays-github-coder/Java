package com.cwa.java8.stream;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {

        // Intermediate operations are lazy, they are not executed until a terminal operation is invoked.
        // They return a new stream and can be chained together.

        // Example of intermediate operations:
        // 1. filter()
        // 2. map()
        // 3. sorted()
        // 4. distinct()
        // 5. limit()
        // 6. skip()

        List<Integer> numbers
                = Arrays.asList(5, 10, 20, 10, 30, 40);

        numbers.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}
