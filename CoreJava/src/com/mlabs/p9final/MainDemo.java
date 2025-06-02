package com.mlabs.p9final;

class A{
	final void greet() {
		System.out.println("Greetings");
	}
	void greet(int a) {
		System.out.println("Greetings");
	}
	void greet(double b) {
		System.out.println("Greetings");
	}
}

class B extends A{
	
	void greets() {
		System.out.println("Greetings");
	}
}


public class MainDemo {
	public static void main(String[] args) {
		
		final int  a;
		a=10;
//		a += 4;
		System.out.println(a);
		
		new B().greet(3.4);
	}
}
