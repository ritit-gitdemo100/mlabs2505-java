package com.mlabs.p7poly.p1task;

public class Employee extends Personal{

	int empId;
	double salary;
	
	public Employee(String name, String gender, int empId, double salary) {
		super(name, gender);
		this.empId = empId;
		this.salary = salary;
	}
	
	@Override
	void print() {
		System.out.println(empId);
		super.print();
		System.out.println(salary);
	}
	
}
