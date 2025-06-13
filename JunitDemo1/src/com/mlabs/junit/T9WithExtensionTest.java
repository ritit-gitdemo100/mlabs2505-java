package com.mlabs.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.mlabs.Calculator;

@ExtendWith(CustomExtension.class)  // Register the custom extension
class T9WithExtensionTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        // Use case: Addition of two positive numbers
        int result = calculator.add(3, 4);
        assertEquals(7, result, "3 + 4 should be 7");
    }

    @Test
    void testMultiplication() {
        // Use case: Multiplying two positive numbers
        int result = calculator.multiply(5, 6);
        assertEquals(30, result, "5 * 6 should be 30");
    }
}
