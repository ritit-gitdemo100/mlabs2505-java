package com.rit.mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class T6VoidMethodTest {

	@Test
	void testVoidMethod() {

		// Create a mock object
		MyClass myMock = mock(MyClass.class);

		// Stubbing void method to do nothing
		doNothing().when(myMock).voidMethod();

		myMock.voidMethod(); 
		
		Mockito.verify(myMock).voidMethod();

	}

	static class MyClass {
		public void voidMethod() {
			// Actual implementation of void method
		}
	}
}
