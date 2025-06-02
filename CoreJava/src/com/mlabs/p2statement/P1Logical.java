package com.mlabs.p2statement;

public class P1Logical {
	
	static boolean m1() {
		System.out.println("M1 called...");
		return false;
	}
	
	static boolean m2() {
		System.out.println("M2 called...");
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method...");
		
		if(m1() & m2()) {
			System.out.println("True Block Executed");
		} else {
			System.out.println("False Block Executed");
		}
	}
}
