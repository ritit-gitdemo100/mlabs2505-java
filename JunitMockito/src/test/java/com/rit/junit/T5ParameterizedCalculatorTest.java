package com.rit.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class T5ParameterizedCalculatorTest {

	Calculator calculator = new Calculator();

	@RepeatedTest(5)
	void repeatedAdditionTest() {
		// Use case: Repeatedly test addition of same values
		int result = calculator.add(5, 5);
		assertEquals(10, result, "5 + 5 should be 10");
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8 })
	void testIsEven(int number) {
		// Use case: Check if the number is even
		boolean result = calculator.isEven(number);
		assertEquals(true, result, number + " should be even");
	}

	@ParameterizedTest
	@CsvSource({ "2, 3, 7", "10, 20, 30", "7, 8, 15" })
	void testAdditionWithCsvSource(int a, int b, int expected) {
		// Use case: Test addition with CSV source data
		int result = calculator.add(a, b);
		assertEquals(expected, result, "The sum should be correct");
	}
}
