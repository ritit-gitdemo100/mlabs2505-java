package com.mlabs.p4oop;

class Emp6{
	int employeeId;
	String fullName;
	String department;
	String designation;
	static String companyName = "ABC Infotech";
	
	Emp6(int employeeId, String fullName, String department, String designation) {
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.department=department;
		this.designation=designation;
	}
	
	void printEmployee() {
		System.out.println(employeeId);
		System.out.println(fullName);
		System.out.println(department);
		System.out.println(designation);
		System.out.println(Emp6.companyName);
		System.out.println();
	}
}

public class P7Static {
	public static void main(String[] args) {
		
		System.out.println("Welcome to "+Emp6.companyName);

		Emp6 e1 = new Emp6(101,"Anand","Accounts","Manager");
		Emp6 e2 = new Emp6(102,"Bala","Sales","Executive");
		Emp6 e3 = new Emp6(103,"Vinoth","Marketing","Team Leader");
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();

	}
}
