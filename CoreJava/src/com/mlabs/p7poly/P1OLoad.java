package com.mlabs.p7poly;

//Method Overloading

class Sum{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(int a, double b) {
		System.out.println(a+b);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}
	
}

public class P1OLoad {
	public static void main(String[] args) {
		
		new Sum().add(5, 4);
		new Sum().add(5, 4.4);
		new Sum().add(5.5, 4.4);
		
	}
}
