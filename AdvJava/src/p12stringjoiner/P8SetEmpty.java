package p12stringjoiner;

import java.util.StringJoiner;

public class P8SetEmpty {

	public static void main(String[] args) {
		
		StringJoiner s = new StringJoiner(",","{","}");
		
		s.setEmptyValue("Emp");
		System.out.println(s);	
		
		s.add("jan");
		System.out.println(s);		
		
		s.setEmptyValue("Emp");
		System.out.println(s);

	}
}
