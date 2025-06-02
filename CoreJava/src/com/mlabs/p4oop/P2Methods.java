package com.mlabs.p4oop;

class Emp2{
	int employeeId;
	String fullName;
	String department;
	String designation;
	String companyName;
	
	void setEmployee(int a, String b, String c, String d, String e) {
		employeeId = a;
		fullName = b;
		department=c;
		designation=d;
		companyName=e;
	}
	
	void printEmployee() {
		System.out.println(employeeId);
		System.out.println(fullName);
		System.out.println(department);
		System.out.println(designation);
		System.out.println(companyName);
	}
	
}

public class P2Methods {
	public static void main(String[] args) {
		
		Emp2 e1 = new Emp2();
		e1.setEmployee(101,"Anand","Accounts","Manager","ABC Infotech");
		e1.printEmployee();
			
	}
}
