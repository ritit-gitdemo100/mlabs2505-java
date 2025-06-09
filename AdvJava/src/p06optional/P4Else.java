package p06optional;

import java.util.Optional;

public class P4Else {

	String name1 = "Raja";
	String name2;
	
	public static void main(String[] args) {
		
		P4Else obj= new P4Else();
		
		Optional<String> n1 = Optional.ofNullable(obj.name1);
		System.out.println(n1.orElse("Marlabs"));
		
		Optional<String> n2 = Optional.ofNullable(obj.name2);
		System.out.println(n2.orElse("Marlabs"));
		
		
	}

}
