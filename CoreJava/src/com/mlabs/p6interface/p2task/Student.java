package com.mlabs.p6interface.p2task;

public class Student extends Personal implements InputOutput{

	int roll;
	double mark1;
	double mark2;
	double mark3;
	
	void welcomeHome(int roll, double mark1, double mark2, double mark3) {
		this.roll = roll;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	public void printDetails() {
		System.out.println(roll);
		super.printDetails();
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
	}
}
