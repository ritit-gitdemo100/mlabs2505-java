package p12stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class P5Add {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(new String[] {"java","php","python"});
		System.out.println(list);

		StringJoiner sj = new StringJoiner(" and ");
		list.forEach(e -> sj.add(e));
		System.out.println(sj);

	}

}
