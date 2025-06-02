package com.mlabs.p1intro;


//TO store set of information
class Student {
	//fields / instance variables / properties
	int roll;
	String name;
	double mark;
}

public class P4Object {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "Raj";
		s1.mark = 98.4;
		
		Student s2 = new Student();
		s2.roll = 102;
		s2.name = "Rajiv";
		s2.mark = 99.4;	
	}
}

