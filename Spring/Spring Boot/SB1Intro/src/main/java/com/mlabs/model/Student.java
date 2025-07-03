package com.mlabs.model;

public class Student {
	int roll;
	String name;
	double mark;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
	}
	
}
