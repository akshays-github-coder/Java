package com.cwa.java8.stream;

public class TerminalOperations {

    public static void main(String[] args) {
        // Terminal operations are operations that produce a result or a side-effect and mark the end of a stream pipeline.
        // Examples of terminal operations include forEach, collect, reduce, count, min, max, anyMatch, allMatch, noneMatch, findFirst, and findAny.

        // Example of forEach terminal operation
        System.out.println("forEach example:");
        java.util.stream.Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);

        // Example of collect terminal operation
        System.out.println("collect example:");
        java.util.List<Integer> list = java.util.stream.Stream.of(1, 2, 3, 4, 5)
                .collect(java.util.stream.Collectors.toList());
        System.out.println(list);

        // Example of reduce terminal operation
        System.out.println("reduce example:");
        int sum = java.util.stream.Stream.of(1, 2, 3, 4, 5)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        // Example of count terminal operation
        System.out.println("count example:");
        long count = java.util.stream.Stream.of(1, 2, 3, 4, 5).count();
        System.out.println(count);
    }
}
