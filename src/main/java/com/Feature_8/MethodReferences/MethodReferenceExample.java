package com.Feature_8.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "world", "java");

        // Using method reference
        messages.forEach(System.out::println);
    }
}
