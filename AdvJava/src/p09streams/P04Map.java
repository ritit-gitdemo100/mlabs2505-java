package p09streams;

import java.util.ArrayList;
import java.util.List;

public class P04Map {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Arjun");
		list.add("Martin");
		list.add("Alan");
		list.add("Fathima");
		list.add("Mahima");
		
		list.stream()
			.map(s -> s.toUpperCase())
			.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		list.stream()
			.filter(x -> x.startsWith("A"))
			.map(s -> s.length())
			.forEach(s -> System.out.println(s));
		
	}
}
