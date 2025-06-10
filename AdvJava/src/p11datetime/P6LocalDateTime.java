package p11datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class P6LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Actual : "+now);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Formatted : "+now.format(dtf));
		
	}
}
