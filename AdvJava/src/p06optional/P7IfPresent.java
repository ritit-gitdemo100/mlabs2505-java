package p06optional;

import java.util.Optional;

public class P7IfPresent {

	String name1 = "Raja";
	String name2;
	
	public static void main(String[] args) {
		
		P7IfPresent obj= new P7IfPresent();
		
		Optional<String> n1 = Optional.ofNullable(obj.name1);
		n1.ifPresent(System.out::println);
		
		
		Optional<String> n2 = Optional.ofNullable(obj.name2);
		n2.ifPresent(System.out::println);

	}

}
