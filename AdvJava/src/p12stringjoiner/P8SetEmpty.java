package p12stringjoiner;

import java.util.StringJoiner;

public class P8SetEmpty {

	public static void main(String[] args) {
		
		StringJoiner s = new StringJoiner(",","select "," from student");
		
		s.setEmptyValue("select * from student");
		System.out.println(s);	
		
		s.add("name");
		System.out.println(s);		
		
		s.setEmptyValue("Emp");
		System.out.println(s);

	}
}
