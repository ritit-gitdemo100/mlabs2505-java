package p11datetime;

import java.time.LocalDate;

/*
 * LocalDate class is a final Class
 * It represents date with default format of yyyy-MM-dd
 * It stores date WITHOUT a time
 * Its constructor is private
 * We can use the static method now() to get the date
 */

public class P1LocalDate {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today Date : "+today);
		System.out.println("Yesterday Date : "+today.minusDays(3));
		System.out.println("Tomorrow Date : "+today.plusDays(90));

		
		
	}
}
