package p11datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/*
 * LocalDateTime class is a final Class
 * It represents date with default format of yyyy-MM-ddThh:mm:ss.zzz
 * It class does not store or represent a time-zone
 * Its constructor is private
 * We can use the static method now() to get the DateTime
 */

public class P5LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("System DateTime : "+now);
		System.out.println(now.get(ChronoField.DAY_OF_WEEK));
		System.out.println(now.get(ChronoField.DAY_OF_MONTH));
		System.out.println(now.get(ChronoField.DAY_OF_YEAR));
		System.out.println(now.get(ChronoField.HOUR_OF_DAY));
		System.out.println(now.get(ChronoField.MINUTE_OF_DAY));
		
		
	}
}
