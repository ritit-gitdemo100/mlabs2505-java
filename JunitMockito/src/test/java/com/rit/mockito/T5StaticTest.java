package com.rit.mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

class T5StaticTest {

	@Test
	void testVerifying() {

		try (MockedStatic<UserService> mockedStatic = mockStatic(UserService.class)) {

			// Mock the static method behavior
			mockedStatic.when(UserService::sendMail).thenReturn(true);

			// Assert the mock behavior
			assertTrue(UserService.sendMail());

			// Verify the static method was called exactly once
			mockedStatic.verify(UserService::sendMail);

			// You can also verify that it was called a specific number of times
			mockedStatic.verify(UserService::sendMail, times(1)); // verify once
		}

	}
}
