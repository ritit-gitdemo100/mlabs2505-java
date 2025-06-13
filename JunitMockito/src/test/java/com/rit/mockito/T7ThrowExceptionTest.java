package com.rit.mockito;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class T7ThrowExceptionTest {
	
	@Test
    void testVoidMethod() {
    	
        MyClass myMock = mock(MyClass.class);

        // Stubbing method to throw an exception
        doThrow(new RuntimeException("Exception thrown"))
        		.when(myMock).voidMethod(); 

        try {
        	myMock.voidMethod(); // This will throw a RuntimeException
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    static class MyClass {
        public void voidMethod() {
            // Actual implementation of void method
        }
    }
}
