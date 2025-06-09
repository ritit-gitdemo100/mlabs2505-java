package p09streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P01Demo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Arjun");
		list.add("Martin");
		list.add("Alan");
		list.add("Fathima");
		list.add("Mahima");
		
		List<String> filteredList = new ArrayList<>();
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String tmp = i.next();
			if(tmp.endsWith("n"))
				filteredList.add(tmp);
		}
		
		for(String name:filteredList) {
			System.out.println(name);
		}
	}
}
