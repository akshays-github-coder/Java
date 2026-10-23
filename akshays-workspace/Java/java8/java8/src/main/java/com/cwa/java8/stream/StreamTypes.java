package com.cwa.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTypes {
    public static void main(String[] args) {

        System.out.println("**** 1. Sequential Stream ****");
        List<String> names = Arrays.asList("A", "B", "C", "D");
        names.stream()
                .forEach(System.out::println); // Executes sequentially

        System.out.println("\n**** 2. Parallel Streams ****");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream().forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));

        System.out.println("\n**** 3. Infinite Streams ****");
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\n**** 1. Primitive Streams ****");
        IntStream.range(1, 5).forEach(System.out::println);
        LongStream.range(1, 5).forEach(System.out::println);
        DoubleStream.of(1.0, 2.0, 3.0, 4.0).forEach(System.out::println);
    }
}
