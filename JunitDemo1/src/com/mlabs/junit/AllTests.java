package com.mlabs.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.mlabs.junit.T8NestedTest.AdditionTests;
import com.mlabs.junit.T8NestedTest.MultiplicationTests;
import com.mlabs.junit.T8NestedTest.SubtractionTests;

@Suite
@SelectClasses({ AdditionTests.class, MultiplicationTests.class, SubtractionTests.class, T1Test.class,
		T2AssertionTest.class, T3BasicOperationsTest.class, T4LifecycleCalculatorTest.class,
		T5ParameterizedCalculatorTest.class, T6CSVFileTest.class, T7DisabledTest.class, T8NestedTest.class,
		T9WithExtensionTest.class })
public class AllTests {

}
