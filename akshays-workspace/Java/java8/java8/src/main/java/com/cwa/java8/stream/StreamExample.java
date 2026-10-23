package com.cwa.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 100, "GROCERY"),
                new Transaction(3, 80, "GROCERY"),
                new Transaction(6, 120, "GROCERY"),
                new Transaction(7, 40, "ELECTRONICS"),
                new Transaction(10, 50, "GROCERY")
        );

        // Stream pipeline based on your diagram
        List<Integer> transactionIds = transactions.stream()
                .filter(t -> t.getType().equals("GROCERY"))       // keep only groceries
                .sorted(Comparator.comparing(Transaction::getValue).reversed()) // sort by value desc
                .map(Transaction::getId)                         // map to id
                .collect(Collectors.toList());                   // collect as list

        System.out.println(transactionIds);
    }
}