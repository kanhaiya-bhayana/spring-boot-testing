package com.appsdeveloperblog;

import org.junit.jupiter.api.*;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Math operations in Calculator Class")
class CalculatorTest {

    // naming convention
    // test<System Under Test>_<Condition or State Change>_<Expected Result>

    Calculator calculator;

    @BeforeAll
    static void setup(){
        System.out.println("Executing @BeforeAll method.");
    }
    @AfterAll
    static void cleanUp(){
        System.out.println("Executing @AfterAll method.");
    }
    @BeforeEach
     void beforeEachTestMethod(){
        calculator = new Calculator();
        System.out.println("Executing @BeforeEach method.");
    }

    @AfterEach
    void afterEachTestMethod(){
        calculator = new Calculator();
        System.out.println("Executing @AfterEach method.");
    }

    @DisplayName("Test 4/2 = 2")
    @Test
    void testIntegerDivision_FourDividedByTwo_ShouldReturnTwo() {
        // Arrange - Given
//        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = 4/2;
        Supplier<String> lambda = () -> expected + " not equal to " + actual;

        // Act - When
        int result = calculator.integerDivision(4,2);

        // Assert - Then
        assertEquals(expected, actual,
                () -> expected + " not equal to " + actual);
        assertEquals(expected,actual,lambda);
    }

    @DisplayName("Division by zero")
    @Test
    void testIntegerDivision_DivideByZero_ShouldThrowArithmeticException(){
    }
}