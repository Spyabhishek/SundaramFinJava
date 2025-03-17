package com.java8;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "  ", "Bob", "", "Charlie");

        names.stream()
                .filter(Predicate.not(String::isBlank))
                .forEach(System.out::println);
    }
}
