package com.mlabs.p1intro;


class Student2 {
	int roll;
	String name;
	double mark;
	
	void setData(int roll, String name, double mark) {
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	void printData() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(mark);
		System.out.println();
	}
}

public class P6This {
	
	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
		s1.setData(101,"Raj",98.4);
		
		Student2 s2 = new Student2();
		s2.setData(102,"Rajiv",99.4);
		
		s1.printData();
		s2.printData();
	}
}

