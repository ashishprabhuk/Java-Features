package com.Feature_8.FunctionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression to define the calculate method for addition
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(10, 5)); // Output: 15

        // Using lambda expression to define the calculate method for subtraction
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(10, 5)); // Output: 5

        // Using lambda expression to define the calculate method for multiplication
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(10, 5)); // Output: 50

        // Using lambda expression to define the calculate method for division
        Calculator division = (a, b) -> a / b;
        System.out.println("Division: " + division.calculate(10, 5)); // Output: 2
    }
}
