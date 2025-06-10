package p12stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class P6Merge {

	public static void main(String[] args) {
		
		StringJoiner s1 = new StringJoiner(",","[","]");
		s1.add("jan");
		s1.add("feb");
		s1.add("mar");
		System.out.println(s1);

		StringJoiner s2 = new StringJoiner("-","(",")");
		s2.add("apr");
		s2.add("may");
		s2.add("jun");
		System.out.println(s2);

		s1.merge(s2);
		System.out.println(s1);
	}

}
