package com.mlabs.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.mlabs.Calculator;

public class T5ParameterizedCalculatorTest {

	Calculator calculator = new Calculator();

	@RepeatedTest(5)
	void repeatedAdditionTest() {

		int a = new Random().nextInt(10);
		
		boolean actual = calculator.isEven(a);
		System.out.println(a+" is even "+actual);
		assertTrue(actual, a+" is even "+actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8 })
	void testIsEven(int number) {

		boolean result = calculator.isEven(number);
		assertEquals(true, result, number + " should be even");
	}

	@ParameterizedTest
	@CsvSource({ "2, 3, 5", "10, 20, 30", "7, 8, 15" })
	void testAdditionWithCsvSource(int a, int b, int expected) {

		int result = calculator.add(a, b);
		assertEquals(expected, result, "The sum should be correct");
	}
}
