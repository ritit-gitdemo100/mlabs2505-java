package com.mlabs.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mlabs.Demo1;

class Demo1Test {

	@Test
	void testIsValidUserName() {
//		fail("Not yet implemented");
		boolean expected = true;
		boolean actual = new Demo1().isValidUserName("SunFlower");
		assertEquals(expected, actual);
	}


	@Test
	void testIsValidUserName1() {
		boolean expected = true;
		boolean actual = new Demo1().isValidUserName("Sun");
		assertEquals(expected, actual);
	}
}
