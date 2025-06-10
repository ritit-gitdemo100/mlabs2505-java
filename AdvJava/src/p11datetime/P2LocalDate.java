package p11datetime;

import java.time.LocalDate;


public class P2LocalDate {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2023,01,15);
		System.out.println("Date : "+date1);
		System.out.println("Is it leap year : "+date1.isLeapYear());
	}
}

