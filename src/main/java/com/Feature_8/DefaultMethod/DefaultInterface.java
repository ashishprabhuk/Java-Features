package com.Feature_8.DefaultMethod;

public interface DefaultInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is the default method implementation.");
    }
}
