package p06optional;

import java.util.Optional;

public class P3ElseThrow {

	String name1 = "Raja";
	String name2;
	
	public static void main(String[] args) {
		
		P3ElseThrow obj= new P3ElseThrow();
		
		Optional<String> n1 = Optional.ofNullable(obj.name1);
		System.out.println(n1.orElseThrow(NullPointerException::new));
		
		Optional<String> n2 = Optional.ofNullable(obj.name2);
		System.out.println(n2);
		
		Optional<String> n3 = Optional.ofNullable(obj.name2);
		System.out.println(n3.orElseThrow(ArithmeticException::new));
		
		
	}

}
