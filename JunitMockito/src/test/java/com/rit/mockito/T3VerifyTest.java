package com.rit.mockito;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class T3VerifyTest {

	@Test
	void testVerifying() {

		UserService userService = mock(UserService.class);

		userService.sendSMS();

		// Verifying if above methods was called
		Mockito.verify(userService).sendSMS();
		
	}
}
