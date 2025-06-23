package com.marlabs;

import java.time.LocalDate;
import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class EmployeeMain {
	public static void main(String[] args) {

		LocalDate futureDate = LocalDate.of(2030, 1, 1);
		LocalDate pastDate = LocalDate.of(2020, 1, 1);
		
		isValid(new Employee(null, -3, null, futureDate, 123.123));
		isValid(new Employee("a", 100, "", pastDate, 123));
		isValid(new Employee("a$bcd%&", 40, "abc", pastDate, -123.123));
		
		isValid(new Employee("Anand", 40, "abc@gmail.com", pastDate, 12345.12));
		
	}

	static void isValid(Employee employee) {
		// Create a ValidatorFactory and Validator
		ValidatorFactory vFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = vFactory.getValidator();

		// Validate the User instance
		Set<ConstraintViolation<Employee>> violations = validator.validate(employee);

		if (violations.isEmpty())
			System.out.println( "Validation Success \n");
		else {
			// Print validation errors
			for (ConstraintViolation<Employee> violation : violations) {
				System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
			}
			System.out.println( "Validation Failed \n");
		}
	}
}
