package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5.1;
        double b = 8.2;
        double sumResult = calculator.sum(a, b);
        assertEquals(13.3, sumResult, 0.1);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult, 0.1);
    }

    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        double a = -5;
        double squaredResult = calculator.squared(a);
        assertEquals(25,squaredResult, 0.1);
    }
}
