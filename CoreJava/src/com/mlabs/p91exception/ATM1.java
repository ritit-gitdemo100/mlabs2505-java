package com.mlabs.p91exception;

import java.util.Scanner;

public class ATM1 {
	public static void main(String[] args) {
		
		int balance = 1000;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter Amount :");
			int amount = scanner.nextInt();
			
			balance = balance - amount;
			System.out.println("Withdrawal Seecessful, Remaining balance is "+balance);
			
			scanner.close();
		}
		catch(Exception e) {
			System.out.println("Some Problem, Contact Admin");
		}
	}
}
