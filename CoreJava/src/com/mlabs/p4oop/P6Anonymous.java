package com.mlabs.p4oop;

class Greetings {
	//instance method
	void greet() {
		System.out.println("Greetings from Java");
	}
	
	//static methods
	static void wish() {
		System.out.println("Wishes from Java");
	}
}

public class P6Anonymous {
	public static void main(String[] args) {
		
		Greetings g = new Greetings();
		g.greet();
		
		//Anonymous object
		new Greetings().greet();
		
		//To invoke static method, we dont need/use any object
		Greetings.wish();
	}
}
