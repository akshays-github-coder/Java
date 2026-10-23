package com.cwa.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java.util.*;
import java.util.stream.*;

public class StreamCreation {
    public static void main(String[] args) {

        // 1. From a Collection
        List<String> list = Arrays.asList("Java", "Python", "C++");
        Stream<String> stream1 = list.stream();

        // 2. From an Array
        String[] arr = {"A", "B", "C"};
        Stream<String> stream2 = Arrays.stream(arr);

        // 3. Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);

        // 4. Infinite Stream (limit to avoid infinite loop)
        Stream<Integer> stream4 = Stream.iterate(1, n -> n + 1).limit(5);
        stream4.forEach(System.out::println);
    }
}