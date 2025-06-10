package p12stringjoiner;

import java.util.StringJoiner;

public class P7Length {

	public static void main(String[] args) {
		
		StringJoiner s = new StringJoiner(",","{","}");
		
		System.out.println(s);		
		System.out.println("Length : "+s.length());
		
		s.add("jan");
		System.out.println(s);		
		System.out.println("Length : "+s.length());
		
		s.add("feb");
		System.out.println(s);		
		System.out.println("Length : "+s.length());

	}
}
