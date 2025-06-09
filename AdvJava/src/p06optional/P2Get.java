package p06optional;

import java.util.Optional;

public class P2Get {

	String name1 = "Raja";
	String name2;
	
	public static void main(String[] args) {
		
		P2Get obj= new P2Get();
		
		Optional<String> n1 = Optional.ofNullable(obj.name1);
		System.out.println(n1.get());
		
		Optional<String> n2 = Optional.ofNullable(obj.name2);
		System.out.println(n2.get());
		
		
	}

}
