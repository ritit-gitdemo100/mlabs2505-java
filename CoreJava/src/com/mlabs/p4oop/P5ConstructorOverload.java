package com.mlabs.p4oop;

class Emp5{
	int employeeId;
	String fullName;
	String department;
	String designation;
	String companyName;
	
	Emp5(int employeeId, String fullName, String department, String designation, String companyName) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.department=department;
		this.designation=designation;
		this.companyName=companyName;
	}
	
	//default constructor
	public Emp5() {
		employeeId = 100;
		fullName = "None";
	}
	
	//Clone constructor
	Emp5(Emp5 obj) {
		employeeId = obj.employeeId;
		fullName = obj.fullName;
		department=obj.department;
		designation=obj.designation;
		companyName=obj.companyName;
	}
	void printEmployee() {
		System.out.println(this.employeeId);
		System.out.println(fullName);
		System.out.println(department);
		System.out.println(designation);
		System.out.println(companyName);
		System.out.println();
	}
}

public class P5ConstructorOverload {
	public static void main(String[] args) {
		
		Emp5 e1 = new Emp5(101,"Anand","Accounts","Manager","ABC Infotech");
		e1.printEmployee();
			
		Emp5 e2 = new Emp5();
		e2.printEmployee();
		
		//A new object (memory block) created with data copied from e1 object
		Emp5 e3 = new Emp5(e1);
		e3.printEmployee();
		
		//A new reference variable created in the stack and it is assigned
		//with the address of e3;
		//now in stack both e3 and e4 will be assigned with the same address 
		Emp5 e4 = e3;
		e4.fullName="Bala";
		e4.printEmployee();
		e3.printEmployee();
		e1.printEmployee();
		
	}
}
