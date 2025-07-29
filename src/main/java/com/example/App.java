package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains various intentional errors for demonstration purposes.
 */
public class App {

    // Unused private field
    private String unusedField = "Hello";

    public static void main(String[] args) {
        App app = new App();
        app.demonstrateErrors();
    }

    public void demonstrateErrors() {
        // 1. Unused local variable
        int unusedVariable = 10;

        // 2. Potential NullPointerException
        String nullString = null;
        System.out.println(nullString.length()); // This will throw NullPointerException at runtime

        // 3. Division by zero
        int numerator = 100;
        int denominator = 0;
        int result = numerator / denominator; // This will throw ArithmeticException at runtime
        System.out.println("Result: " + result);
		
		
    }

    // Method with missing Javadoc
    public void calculateSomething(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
