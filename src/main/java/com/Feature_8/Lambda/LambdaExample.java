package com.Feature_8.Lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        // Step 3: Create a list of Person objects
        List<Person> persons = Arrays.asList(
                new Person("John", 25),
                new Person("Sarah", 30),
                new Person("Mike", 20),
                new Person("Anna", 35),
                new Person("Paul", 28)
        );

        // Step 4: Use lambda expressions and Stream API to filter and process the list
        List<String> filteredNames = persons.stream()
                .filter(p -> p.getAge() > 25) // Filter persons older than 25
                .map(p -> p.getName().toUpperCase()) // Convert names to uppercase
                .collect(Collectors.toList()); // Collect the results into a list

        // Step 5: Print the filtered names
        filteredNames.forEach(System.out::println);
    }
}

//func() -> expression.expression.expression
