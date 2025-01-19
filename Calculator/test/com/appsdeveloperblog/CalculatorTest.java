package com.appsdeveloperblog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void integerDivision() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = 4/2;
        int result = calculator.integerDivision(4,2);
        assertEquals(expected, actual,
                () -> expected + " not equal to " + actual);
    }
}