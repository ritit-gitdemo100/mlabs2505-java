package com.mlabs.p7poly;

class A{
	void greet() {
		System.out.println("Greetings from A");
	}
}

class B extends A{
	void greet() {
		super.greet();
		System.out.println("Greetings from B");
		super.greet();
	}
}


public class P2ORide {
	public static void main(String[] args) {
		
		B insB = new B();
		insB.greet();

	}
}
