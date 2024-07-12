package com.Feature_8.Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // 1. Creating Optional Instances
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nonEmptyOptional = Optional.of("Hello");
        Optional<String> nullableOptional = Optional.ofNullable(null);

        // 2. Checking Value Presence
        if (nonEmptyOptional.isPresent()) {
            System.out.println("nonEmptyOptional contains: " + nonEmptyOptional.get());
        } else {
            System.out.println("nonEmptyOptional is empty");
        }

        // Using ifPresent() to perform an action if a value is present
        nonEmptyOptional.ifPresent(value -> System.out.println("Value in nonEmptyOptional: " + value));

        // ifPresentOrElse() method introduced in Java 9
        nonEmptyOptional.ifPresentOrElse(
                value -> System.out.println("Value in nonEmptyOptional: " + value),
                () -> System.out.println("nonEmptyOptional is empty")
        );

        // 3. Getting the Value
        // Using get() method
        try {
            System.out.println("Value in nullableOptional: " + nullableOptional.get());
        } catch (Exception e) {
            System.out.println("nullableOptional is empty");
        }

        // Using orElse() method
        String valueOrDefault = nullableOptional.orElse("Default Value");
        System.out.println("Value in nullableOptional (or default): " + valueOrDefault);

        // Using orElseGet() method
        valueOrDefault = nullableOptional.orElseGet(() -> "Generated Default Value");
        System.out.println("Value in nullableOptional (or generated default): " + valueOrDefault);

        // Using orElseThrow() method
        try {
            String valueOrThrow = nullableOptional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
            System.out.println("Value in nullableOptional (or throw): " + valueOrThrow);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 4. Transforming the Value
        // Using map() method
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of value in nonEmptyOptional: " + length));

        // Using flatMap() method
        Optional<Integer> flatMappedOptional = nonEmptyOptional.flatMap(s -> Optional.of(s.length()));
        flatMappedOptional.ifPresent(length -> System.out.println("Length of value in nonEmptyOptional (flatMapped): " + length));

        // 5. Filtering the Value
        // Using filter() method
        Optional<String> filteredOptional = nonEmptyOptional.filter(s -> s.startsWith("H"));
        filteredOptional.ifPresent(value -> System.out.println("Filtered value: " + value));

        // Practical Example: Fetching a User Name
        UserService userService = new UserService();
        Optional<String> userName = userService.getUserNameById(1);

        // Using ifPresent() to print the user name if present
        userName.ifPresent(name -> System.out.println("User Name: " + name));

        // Using orElse() to provide a default value if user name is not present
        String defaultUserName = userService.getUserNameById(2).orElse("Default User");
        System.out.println("User Name: " + defaultUserName);

        // Combining Optional methods in a chain
        String result = userService.getUserNameById(3)
                .map(String::toUpperCase)
                .filter(name -> name.length() > 5)
                .orElse("Short Name or Absent");
        System.out.println("Processed User Name: " + result);
    }
}

class UserService {
    public Optional<String> getUserNameById(int userId) {
        // Simulate a user retrieval, could be from a database or another source
        if (userId == 1) {
            return Optional.of("Ashish");
        } else if (userId == 2) {
            return Optional.ofNullable(null);
        } else if (userId == 3) {
            return Optional.of("Tom");
        } else {
            return Optional.empty();
        }
    }
}
