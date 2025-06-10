package p12stringjoiner;

import java.util.StringJoiner;

public class P2Add {

	public static void main(String[] args) {
		
		StringJoiner s = new StringJoiner(",");
		
		s.add("jan");
		s.add("feb");
		s.add("mar");
		
		System.out.println(s);

	}

}
