package com.mlabs.p2statement;

import java.util.Scanner;

public class P5DoWhile {

//	while(condition) {
//		body;
//		iterative-expression
//	}
	public static void main(String[] args) {
		
		byte count = 100;
		do {
			System.out.println(count+". Welcome to Java");
			count++;
		}while(count <= 10);
		
		System.out.println("End");

	}
}
