package p11datetime;

import java.time.LocalTime;

/*
 * LocalTime class is a final Class
 * It represents time with default format of hh:mm:ss
 * It stores time WITHOUT a date
 * Its constructor is private
 * We can use the static method now() to get the time
 */

public class P3LocalTime {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("System Time : "+currentTime);
		System.out.println("PlusHours : "+currentTime.plusHours(2));
		System.out.println("MinusHours : "+currentTime.minusHours(2));
		System.out.println("PlusMinutes : "+currentTime.plusMinutes(2));
		System.out.println("MinusMinutes : "+currentTime.minusMinutes(2));
	}
}
