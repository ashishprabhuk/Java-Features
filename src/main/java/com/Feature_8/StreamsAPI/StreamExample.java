package com.Feature_8.StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.function.Predicate.not;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Count empty strings
        long count = strings.stream().filter(String::isEmpty).count();
        System.out.println("Empty strings count: " + count);

        // Filter and collect non-empty strings
        List<String> filtered = strings.stream().filter(not(String::isEmpty)).collect(Collectors.toList());
        System.out.println("Filtered list: " + filtered);

        // Map and collect uppercase strings
        List<String> uppercased = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercased list: " + uppercased);
    }
}
