package com.Feature_8.DefaultMethod;

public class MyClass implements DefaultInterface {
    // Implement the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }

    // Optionally, override the default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method implementation.");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Call the implemented abstract method
        myClass.abstractMethod();

        // Call the default method
        myClass.defaultMethod();
    }
}
