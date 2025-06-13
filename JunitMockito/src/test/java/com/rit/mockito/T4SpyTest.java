package com.rit.mockito;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class T4SpyTest {

	@Test
	void testVerifying() {

		UserService userService = new UserService();

		// Creating spy - Partial mocking
		UserService spyService = spy(userService);
		
		//Real Method calls
		spyService.sendSMS();

		// Stubbing mocked method
		when(spyService.getUserName(102)).thenReturn("Gayathri");

		// Asserting that the mocked behavior works
		assert spyService.getUserName(102).equals("Gayathri");

	}
}
