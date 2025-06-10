package p11datetime;

import java.time.Clock;
import java.time.ZoneId;

/*
 * Clock is an abstract Class
 * It provides access to current instant, date and time using a time-zone
 * Its constructor is protected
 */

public class P7Clock {

	public static void main(String[] args) {
		
		Clock c = Clock.systemDefaultZone();
		ZoneId zoneId = c.getZone();
		System.out.println(zoneId);
		
		
	}
}
