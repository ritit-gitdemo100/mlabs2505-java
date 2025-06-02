package com.mlabs.p6interface.p1;

interface greetings{
	//No Properties
	//No Method Definitions
	//Method declaration
	public void greet();
	public void wish();
}

class IntfDemo implements greetings{

	public void greet() {
		System.out.println("Greetings...");
	}

	public void wish() {
		System.out.println("Wishes");
	}

}

public class MainDemo {
	public static void main(String[] args) {
		IntfDemo obj = new IntfDemo();
		obj.greet();
		obj.wish();
	}
}
