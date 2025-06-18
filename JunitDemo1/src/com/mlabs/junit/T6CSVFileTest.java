package com.mlabs.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.mlabs.Calculator;

public class T6CSVFileTest {

	Calculator calculator = new Calculator();

	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip=1)
		void testAdditionWithCsvSource(int a, int b, int expected) {

		int result = calculator.add(a, b);
		assertEquals(expected, result, "The sum should be correct");
	}
	
}
