package p06optional;

import java.util.Optional;

public class P5IsEmpty {

	String name1 = "Raja";
	String name2;
	
	public static void main(String[] args) {
		
		P5IsEmpty obj= new P5IsEmpty();
		
		Optional<String> n1 = Optional.ofNullable(obj.name1);
		if(n1.isEmpty())
			System.out.println("No Data");
		else
			System.out.println(n1.get());
		
		Optional<String> n2 = Optional.ofNullable(obj.name2);
		if(n2.isEmpty())
			System.out.println("No Data");
		else
			System.out.println(n2.get());
		
	}

}
