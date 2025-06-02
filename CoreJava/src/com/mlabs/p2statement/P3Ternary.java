package com.mlabs.p2statement;

import java.util.Scanner;

public class P3Ternary {

	// Ternary operator (replacement for simple if else)
	// (condition) ? True-block : False-block
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		
//		if( num >= 0 )
//			System.out.println(num+" is a Positive Number");
//		else
//			System.out.println(num+" is a Negative Number");

		
//		String numType;		
//		if( num >= 0 )
//			numType = "Positive";
//		else
//			numType = "Negative";
//		
////		System.out.println(num+" is a "+numType+" Number");
//		System.out.printf("%d is a %s Number\n",num,numType);
		
		
//		String numType = ( num >= 0 ) ? "Positive" : "Negative";
//		System.out.printf("%d is a %s Number\n",num,numType);

//		System.out.printf("%d is a %s Number\n",num,(( num >= 0 ) ? "Positive" : "Negative"));
		
		System.out.println(num+" is a "+(( num >= 0 ) ? "Positive" : "Negative")+" Number");
		System.out.println(num+" is a "+(( num%2==0 ) ? "Even" : "Odd")+" Number");

	}
}
