package com.Features_9to17.var;

import java.util.List;

public class VarExamples {
    public static void main(String[] args) {
        // Using var for local variables
        var number = 10; // inferred as int
        var message = "Hello, World!"; // inferred as String
        var price = 19.99; // inferred as double

        // Using var with an object
        var app = new App(); // inferred as App
        app.printData();

        // Using var in a loop
        var list = List.of("Apple", "Banana", "Cherry");
        for (var item : list) {
            System.out.println(item);
        }

        // Wrong Usage
        // var x = null; // Compile-time error
        // var lambda = () -> System.out.println("Lambda"); // Compile-time error
        // var numbers = {1, 2, 3}; // Compile-time error

        // Correct usage
        var numbers = new int[]{1, 2, 3}; // inferred as int[]
        var list1 = List.of(1, 2, 3); // inferred as List<Integer>
    }
}
