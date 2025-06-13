package com.rit.junit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class T7DisabledTest {

    Calculator calculator = new Calculator();

    @Test
    @Disabled("This test is temporarily disabled due to a known issue")
    void disabledTest1() {
        // This test will not run
        assertEquals(10, calculator.add(5, 5), "This test should not run");
    }
    
    @Test
    void disabledTest2() {
        // This test will not run
        assertEquals(10, calculator.add(5, 5), "This test should not run");
    }
}
