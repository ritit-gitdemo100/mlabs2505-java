package p09streams;

import java.util.Arrays;
import java.util.List;

public class P06MethodReference {
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList(" Arjun ", "Martin", " Alan ");

		names.stream()
				.map(String::trim) 
				.map(StringBuilder::new) 
				.map(StringBuilder::reverse) 
				.map(StringBuilder::toString) 
				.forEach(System.out::println); 
		
	}
}
