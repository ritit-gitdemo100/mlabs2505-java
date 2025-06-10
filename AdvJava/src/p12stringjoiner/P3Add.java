package p12stringjoiner;

import java.util.StringJoiner;

public class P3Add {

	public static void main(String[] args) {
		
		StringJoiner s = new StringJoiner( ",",  "select ",  " from table_name" );
		
		s.add("jan");
		s.add("feb");
		s.add("mar");
		
		System.out.println(s);

	}

}
