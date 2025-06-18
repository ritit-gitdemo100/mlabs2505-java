package com.mlabs.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.mlabs.Calculator;

public class T3BasicOperationsTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {

        assertEquals(7, calculator.add(3, 4), "Addition of 3 and 4 should be 7");
        
        assertEquals(1, calculator.add(5, -4), "Addition of 5 and -4 should be 1");
        
        assertEquals(-7, calculator.add(-3, -4), "Addition of -3 and -4 should be -7");
    }

    @Test
    void testSubtraction() {

        assertEquals(4, calculator.subtract(9, 5), "9 - 5 should be 4");
        
        assertEquals(-2, calculator.subtract(3, 5), "3 - 5 should be -2");
        
        assertEquals(7, calculator.subtract(5, -2), "5 - (-2) should be 7");
    }

    @Test
    void testMultiplication() {

        assertEquals(20, calculator.multiply(4, 5), "4 * 5 should be 20");
        
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should be 0");
        
        assertEquals(12, calculator.multiply(-3, -4), "-3 * -4 should be 12");
    }

    @Test
    void testDivision() {

        assertEquals(5.0, calculator.divide(10, 2), "10 / 2 should be 5.0");
        
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
        
        assertEquals(-2.5, calculator.divide(-5, 2), "-5 / 2 should be -2.5");
    }
}
