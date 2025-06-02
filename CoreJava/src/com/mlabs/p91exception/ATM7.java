package com.mlabs.p91exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM7 {
	public static void main(String[] args) {
		
		int balance = 1000;
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				System.out.print("Enter Amount :");
				int amount = scanner.nextInt();
				
				balance = withdraw(balance, amount);
				
				System.out.println("Withdrawal Seecessful, Remaining balance is "+balance);
				
			}
			catch(IllegalArgumentException | InsufficientBalanceException e) {
				System.out.println("Error : "+e.getMessage());
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input, Enter a numeric input");
			}
			catch(Exception e) {
				System.out.println("Some Problem, Contact Admin");
			}
			finally {
//			scanner.close();
				System.out.println("Thank you");
			}
		}
	}

	private static int withdraw(int balance, int amount) throws InsufficientBalanceException, IllegalArgumentException {
		if(amount < 0)
			throw new IllegalArgumentException("Amount cannot be negative.");
			
		if(amount > balance)
			throw new InsufficientBalanceException("Insufficient Balance");
			
			
		return balance - amount;
	}
}
