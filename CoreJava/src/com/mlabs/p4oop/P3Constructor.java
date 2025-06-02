package com.mlabs.p4oop;

class Emp3{
	int employeeId;
	String fullName;
	String department;
	String designation;
	String companyName;
	
	//constructor
	//It is used to initialize the object while at creation
	Emp3(int a, String b, String c, String d, String e) {
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

public class P3Constructor {
	public static void main(String[] args) {
		
		Emp3 e1 = new Emp3(101,"Anand","Accounts","Manager","ABC Infotech");
		e1.printEmployee();
			
	}
}
