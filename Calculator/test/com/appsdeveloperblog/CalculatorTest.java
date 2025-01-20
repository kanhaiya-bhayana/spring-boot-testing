package com.appsdeveloperblog;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Math operations in Calculator Class")
class CalculatorTest {

    // naming convention
    // test<System Under Test>_<Condition or State Change>_<Expected Result>
    Calculator calculator;
    @BeforeEach
     void beforeEachTestMethod(){
        calculator = new Calculator();
//        System.out.println("Executing @BeforeEach method.");
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

    // @Disabled("TODO: Still need to work on it")
    @DisplayName("Division by zero")
    @Test
    void testIntegerDivision_DivideByZero_ShouldThrowArithmeticException(){
        // Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        // Act & Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            // Act
            calculator.integerDivision(dividend, divisor);
        }, "Division by zero should have thrown an Arithmetic exception.");

        // Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(),
                "Unexpected exception message");

    }

//    @MethodSource()
    @CsvSource({
            "33,1,32",
            "199,20,179"
    })
    @DisplayName("Test integer subtraction [minuend, subtrahend, expectedResult]")
    @ParameterizedTest
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        calculator = new Calculator();
        int actualResult = calculator.integerSubtraction(minuend,subtrahend);
        assertEquals(expectedResult,actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }


    private static Stream<Arguments> integerSubtraction(){
        return Stream.of(
                Arguments.of(33,1,32),
                Arguments.of(199,20,179)
        );
    }
}