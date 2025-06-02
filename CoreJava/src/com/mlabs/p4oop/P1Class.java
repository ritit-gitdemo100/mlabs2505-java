package com.mlabs.p4oop;

class Emp1{
	//instance variables / fields / properties
	int employeeId;
	String fullName;
	String department;
	String designation;
	String companyName;
}

public class P1Class {
	public static void main(String[] args) {
		//To set of 100 employees ( 5 information )
		
		Emp1 e1;
		//It will create a memory block in stack
		//To hold the address of an object
		//It will be initialized with null
		
		e1 = new Emp1();
		// new Emp1() creates an object in the heap memory
		// The address of this object will be assigned 
		// with the e1 at stack memory
		
		e1.employeeId = 101;
		e1.fullName = "Anand";
		e1.department="Accounts";
		e1.designation="Manager";
		e1.companyName="ABC Infotech";
		
		System.out.println(e1.employeeId);
		System.out.println(e1.fullName);
		System.out.println(e1.department);
		System.out.println(e1.designation);
		System.out.println(e1.companyName);
	}
}
