package com.mlabs.p1intro;


class Student3 {
	int roll;
	String name;
	double mark;
	
	Student3(int roll, String name, double mark) {
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

public class P7Constructor {
	
	public static void main(String[] args) {
		
		Student3 s1 = new Student3(101,"Raj",98.4);
		
		Student3 s2 = new Student3(102,"Rajiv",99.4);
		
		s1.printData();
		s2.printData();
	}
}

