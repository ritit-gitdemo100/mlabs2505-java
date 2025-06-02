package com.mlabs.p4oop;

class Emp4{
	int employeeId;
	String fullName;
	String department;
	String designation;
	String companyName;
	
	Emp4(int employeeId, String fullName, String department, String designation, String companyName) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.department=department;
		this.designation=designation;
		this.companyName=companyName;
	}
	
	void printEmployee() {
		System.out.println(this.employeeId);
		System.out.println(fullName);
		System.out.println(department);
		System.out.println(designation);
		System.out.println(companyName);
	}
}

public class P4This {
	public static void main(String[] args) {
		
		Emp4 e1 = new Emp4(101,"Anand","Accounts","Manager","ABC Infotech");
		e1.printEmployee();
			
	}
}
