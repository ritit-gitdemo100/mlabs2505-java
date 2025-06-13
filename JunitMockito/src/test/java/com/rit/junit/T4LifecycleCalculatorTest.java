package com.rit.junit;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T4LifecycleCalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {
        // Simulate setup that happens once for all tests (e.g., establishing DB connections)
        System.out.println("Before all tests");
    }

    @AfterAll
    static void afterAllTests() {
        // Simulate cleanup that happens once after all tests (e.g., closing DB connections)
        System.out.println("After all tests");
    }

    @BeforeEach
    void setUp() {
        // Setup method runs before each test, instantiate the calculator for each test
        calculator = new Calculator();
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() {
        // Cleanup method runs after each test
        System.out.println("After each test");
    }

    @Test
    @DisplayName("Test Addition")
    void testAddition() {
        // Use case: Add two numbers
        int result = calculator.add(10, 20);
        assertEquals(30, result, "10 + 20 should be 30");
    }

    @Test
    @DisplayName("Test Subtraction")
    void testSubtraction() {
        // Use case: Subtract two numbers
        int result = calculator.subtract(10, 4);
        assertEquals(6, result, "10 - 4 should be 6");
    }
}
