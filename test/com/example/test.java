package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    private Calculator calc;
    
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-1, 1));
        assertEquals(-5, calc.add(-2, -3));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2, calc.subtract(5, 3));
        assertEquals(-2, calc.subtract(3, 5));
        assertEquals(0, calc.subtract(5, 5));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(0, calc.multiply(5, 0));
        assertEquals(-10, calc.multiply(-2, 5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(3.0, calc.divide(9, 3), 0.001);
        assertEquals(2.5, calc.divide(5, 2), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calc.divide(10, 0);
    }
}
