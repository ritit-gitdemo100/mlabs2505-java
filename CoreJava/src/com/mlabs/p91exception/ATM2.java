package com.mlabs.p91exception;

import java.util.Scanner;

public class ATM2 {
	public static void main(String[] args) {
		
		int balance = 1000;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter Amount :");
			int amount = scanner.nextInt();
			
			balance = balance - amount;
			System.out.println("Withdrawal Seecessful, Remaining balance is "+balance);
			
		}
		catch(Exception e) {
			System.out.println("Some Problem, Contact Admin");
		}
		finally {
			scanner.close();
			System.out.println("Thank you");
		}
	}
}
