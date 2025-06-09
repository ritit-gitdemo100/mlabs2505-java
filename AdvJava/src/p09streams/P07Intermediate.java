package p09streams;

import java.util.Arrays;
import java.util.List;

public class P07Intermediate {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("cherry", "banana", "apple", "date", "banana", "orange");

		long result = list.stream()
				.filter(s -> s.length() >= 5)
				.map(String::toUpperCase)
				.peek(System.out::println)
				.sorted()
				.distinct()
				.peek(System.out::println)
				.count();

		System.out.println(result);
	}
}
