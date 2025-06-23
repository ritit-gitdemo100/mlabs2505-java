package com.marlabs;

import java.time.LocalDate;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Employee {
	
	@NotNull
	@Size(min=2, max=10)
	@Pattern(regexp = "^[a-zA-Z0-9 .]+$")
	private String name;
	
	@Min(0)
	@Max(50)
	private int exp;
	
	@NotNull(message="Email cannot be null")
	@NotBlank
	@Email
	private String email;
	
	@Past
	private LocalDate doj;
	
	@Digits(integer = 6, fraction = 2)
	private double salary;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(@NotNull @Size(min = 2, max = 10) @Pattern(regexp = "^[a-zA-Z0-9 .]+$") String name,
			@Min(0) @Max(50) int exp, @NotNull(message = "Email cannot be null") @NotBlank @Email String email,
			@Past LocalDate doj, @Digits(integer = 6, fraction = 2) double salary) {
		super();
		this.name = name;
		this.exp = exp;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
