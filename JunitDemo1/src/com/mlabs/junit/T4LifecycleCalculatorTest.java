package com.mlabs.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.mlabs.Calculator;

public class T4LifecycleCalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {

        System.out.println("Before all tests");
    }

    @AfterAll
    static void afterAllTests() {

        System.out.println("After all tests");
    }

    @BeforeEach
    void setUp() {

        calculator = new Calculator();
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @Test
//    @DisplayName("Test Addition")
    void testAddition() {
    	System.out.println("Test Add");
        int result = calculator.add(10, 20);
        assertEquals(30, result, "10 + 20 should be 30");
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSubtraction() {
    	System.out.println("Test Sub");

        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should be 6");
    }
}
