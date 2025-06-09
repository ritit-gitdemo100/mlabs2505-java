package p09streams;

import java.util.Arrays;
import java.util.List;

public class P05Lambda {
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList(" Arjun ", "Martin", " Alan ");

		names.stream()
				.map(s -> s.trim()) 
				.map(s -> new StringBuilder(s)) 
				.map(sb -> sb.reverse()) 
				.map(sb -> sb.toString()) 
				.forEach(s -> System.out.println(s)); 
		
	}
}
