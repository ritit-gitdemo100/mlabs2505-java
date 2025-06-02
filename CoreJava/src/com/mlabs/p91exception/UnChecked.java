package com.mlabs.p91exception;

import java.util.Scanner;

public class UnChecked {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		
		int result = 100 / num;
		System.out.printf("100 / %d is %d \n",num, result);
	}
}
