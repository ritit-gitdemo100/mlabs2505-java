package com.mlabs.p7poly;

class Personal{
	String name;
	String gender;

	public Personal(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	void print() {
		System.out.println(name);
		System.out.println(gender);
	}
}

class Stud extends Personal{
	int roll;
	double mark;
	
	public Stud(String name, String gender, int roll, double mark) {
		super(name, gender);
		this.roll = roll;
		this.mark = mark;
	}
	
	void print() {
		System.out.println(roll);
		super.print();
		System.out.println(mark);
	}
}

public class P3Super {
	public static void main(String[] args) {
		
		Stud stud = new Stud("Raja","male",101, 89.5);
		stud.print();
	}
}
