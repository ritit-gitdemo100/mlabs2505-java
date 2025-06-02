package com.mlabs.p1intro;


class Student1 {
	int roll;
	String name;
	double mark;
	
	void setData(int a, String b, double c) {
		roll = a;
		name = b;
		mark = c;
	}
	void printData() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(mark);
	}
}

public class P5Method {
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.setData(101,"Raj",98.4);
		
		Student1 s2 = new Student1();
		s2.setData(102,"Rajiv",99.4);
		
		s1.printData();
		s2.printData();
	}
}

