package com.rit.mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class T2ArgMatcherTest {

	@Test
	void testVerifying() {

		UserService userService = mock(UserService.class);

		// Stubbing Defining behavior of the mocked method
		when(userService.getUserName(anyInt())).thenReturn("Anand");

		// Asserting that the mocked behavior works
		assert userService.getUserName(101).equals("Anand");

	}
}
