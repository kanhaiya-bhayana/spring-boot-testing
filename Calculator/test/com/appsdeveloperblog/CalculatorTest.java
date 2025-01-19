package com.appsdeveloperblog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Math operations in Calculator Class")
class CalculatorTest {

    // naming convention
    // test<System Under Test>_<Condition or State Change>_<Expected Result>

    @DisplayName("Test 4/2 = 2")
    @Test
    void testIntegerDivision_FourDividedByTwo_ShouldReturnTwo() {
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = 4/2;
        int result = calculator.integerDivision(4,2);
        assertEquals(expected, actual,
                () -> expected + " not equal to " + actual);

        Supplier<String> lambda = () -> expected + " not equal to " + actual;
        assertEquals(expected,actual,lambda);
    }

    @DisplayName("Division by zero")
    @Test
    void testIntegerDivision_DivideByZero_ShouldThrowArithmaticException(){
    }
}