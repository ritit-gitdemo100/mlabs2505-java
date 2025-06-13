package com.rit.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class T2AssertionTest {

    @Test
    public void testAssertions() {
        
        // assertEquals(expected, actual)
        int expected = 5;
        int actual = 5;
        assertEquals(expected, actual, "The values should be equal");

        // assertNotEquals(expected, actual)
        int unexpected = 10;
        assertNotEquals(unexpected, actual, "The values should not be equal");

        // assertTrue(condition)
        boolean isTrue = 10 > 5;
        assertTrue(isTrue, "The condition should be true");

        // assertFalse(condition)
        boolean isFalse = 5 > 10;
        assertFalse(isFalse, "The condition should be false");

        // assertNull(value)
        String str = null;
        assertNull(str, "The value should be null");

        // assertNotNull(value)
        str = "Hello";
        assertNotNull(str, "The value should not be null");

        // assertNotSame(expected, actual)
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2, "The objects should not be the same instance");

        // assertSame(expected, actual)
        Object obj3 = obj1;
        assertSame(obj1, obj3, "The objects should be the same instance");

        // assertThrows(expectedType, executable)
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0; // This will throw ArithmeticException
        }, "Division by zero should throw ArithmeticException");

        // assertDoesNotThrow(executable)
        assertDoesNotThrow(() -> {
            int result = 10 / 2; // This should not throw any exception
        }, "The division should not throw an exception");
    }
}
