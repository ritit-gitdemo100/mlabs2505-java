package com.mlabs.p7poly.p1task;


public class Personal {
	
	String name;
	String gender;
	
	public Personal(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	void print() {
		System.out.println(name);
		System.out.println(gender);
	}
	
}
