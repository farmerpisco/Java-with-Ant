package com.example;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello from Java with Ant!");
        System.out.println("GitHub Actions is working!");
        
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("5 * 6 = " + calc.multiply(5, 6));
        System.out.println("15 / 3 = " + calc.divide(15, 3));
    }
}

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
