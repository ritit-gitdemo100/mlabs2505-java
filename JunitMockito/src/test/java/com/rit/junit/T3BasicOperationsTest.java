package com.rit.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class T3BasicOperationsTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        // Use case: Adding two positive numbers
        assertEquals(7, calculator.add(3, 4), "Addition of 3 and 4 should be 7");
        
        // Use case: Adding a positive and a negative number
        assertEquals(1, calculator.add(5, -4), "Addition of 5 and -4 should be 1");
        
        // Use case: Adding two negative numbers
        assertEquals(-7, calculator.add(-3, -4), "Addition of -3 and -4 should be -7");
    }

    @Test
    void testSubtraction() {
        // Use case: Subtracting two numbers
        assertEquals(4, calculator.subtract(9, 5), "9 - 5 should be 4");
        
        // Use case: Subtracting a larger number from a smaller one
        assertEquals(-2, calculator.subtract(3, 5), "3 - 5 should be -2");
        
        // Use case: Subtracting negative numbers
        assertEquals(7, calculator.subtract(5, -2), "5 - (-2) should be 7");
    }

    @Test
    void testMultiplication() {
        // Use case: Multiplying two positive numbers
        assertEquals(20, calculator.multiply(4, 5), "4 * 5 should be 20");
        
        // Use case: Multiplying by zero
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should be 0");
        
        // Use case: Multiplying two negative numbers
        assertEquals(12, calculator.multiply(-3, -4), "-3 * -4 should be 12");
    }

    @Test
    void testDivision() {
        // Use case: Dividing two numbers
        assertEquals(5.0, calculator.divide(10, 2), "10 / 2 should be 5.0");
        
        // Use case: Dividing by zero
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
        
        // Use case: Dividing a negative number
        assertEquals(-2.5, calculator.divide(-5, 2), "-5 / 2 should be -2.5");
    }
}
