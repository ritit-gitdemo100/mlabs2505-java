package com.mlabs.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.mlabs.Calculator;

public class T8NestedTest {

    @Nested
    class AdditionTests {

        Calculator calculator = new Calculator();

        @Test
        void testAddPositiveNumbers() {
            int result = calculator.add(5, 7);
            assertEquals(12, result, "5 + 7 should be 12");
        }

        @Test
        void testAddNegativeNumbers() {
            int result = calculator.add(-3, -4);
            assertEquals(-7, result, "-3 + (-4) should be -7");
        }
    }

    @Nested
    class SubtractionTests {

        Calculator calculator = new Calculator();

        @Test
        void testSubtractPositiveNumbers() {
            int result = calculator.subtract(10, 4);
            assertEquals(6, result, "10 - 4 should be 6");
        }

        @Test
        void testSubtractNegativeNumbers() {
            int result = calculator.subtract(-5, -3);
            assertEquals(-2, result, "-5 - (-3) should be -2");
        }
    }

    @Nested
    class MultiplicationTests {

        Calculator calculator = new Calculator();

        @Test
        void testMultiplyPositiveNumbers() {
            int result = calculator.multiply(4, 5);
            assertEquals(20, result, "4 * 5 should be 20");
        }

        @Test
        void testMultiplyByZero() {
            int result = calculator.multiply(0, 7);
            assertEquals(0, result, "0 * 7 should be 0");
        }
    }
}
