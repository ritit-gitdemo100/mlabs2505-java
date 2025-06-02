package com.mlabs.p5inher.p2task;

public class NonTech extends Personal {

	int empId;
	String dept;
	String desig;
	int exp;
	double salary;
	
	void fantasticFour(int empId, String dept, String desig, int exp, double salary) {
		this.empId = empId;
		this.dept = dept;
		this.desig = desig;
		this.exp = exp;
		this.salary = salary;
	}
	
	void titanic() {
		System.out.println(empId);
		System.out.println(dept);
		System.out.println(desig);
		System.out.println(exp);
		System.out.println(salary);
	}
}
