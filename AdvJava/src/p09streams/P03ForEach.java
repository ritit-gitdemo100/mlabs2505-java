package p09streams;

import java.util.ArrayList;
import java.util.List;

public class P03ForEach {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Arjun");
		list.add("Martin");
		list.add("Alan");
		list.add("Fathima");
		list.add("Mahima");
		
		list.stream()
			.filter(s -> s.endsWith("n"))
			.forEach(s -> System.out.println(s));

	}
}
