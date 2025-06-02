package com.mlabs.p6interface.p2task;

public class MainDemo {
	public static void main(String[] args) {
		
		Student student = new Student();
		student.greatWeekEnd("Raj", "male", "9500100100", "raj@gmail.com", "Bengaluru", "karnataka");
		student.welcomeHome(101, 33, 44,55);
		student.printDetails();
		
		System.out.println("-----------------------------");
		
		NonTech nonTech = new NonTech();
		nonTech.greatWeekEnd("Mary", "female", "9500100122", "mary@gmail.com", "Trivandrum", "kerala");
		nonTech.fantasticFour(202, "Computers", "Lecturer", 8, 12400.00);
		nonTech.printDetails();
	}
}
