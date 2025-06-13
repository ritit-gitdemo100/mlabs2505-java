package com.mlabs.junit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.mlabs.Calculator;
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
