package p06optional;

import java.util.Optional;

public class P6IsPresent {

	String name1 = "Raja";
	String name2;
	
	public static void main(String[] args) {
		
		P6IsPresent obj= new P6IsPresent();
		
		Optional<String> n1 = Optional.ofNullable(obj.name1);
		if(n1.isPresent())
			System.out.println(n1.get());
		else
			System.out.println("No Data");
		
		Optional<String> n2 = Optional.ofNullable(obj.name2);
		if(n2.isPresent())
			System.out.println(n2.get());
		else
			System.out.println("No Data");
		
	}

}
