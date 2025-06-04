package rough;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainDemo4 {
	public static void main(String[] args) {
		
		LinkedList<Stud> list = new LinkedList<>();
		list.add(new Stud(101,"Abdul",79.5));
		list.add(new Stud(102,"Karthik",44.5));
		list.add(0,new Stud(103,"Joseph",59.5));
		
		ArrayList<Stud> list2 = new ArrayList<>();
		list2.add(new Stud(104,"Dhoni",83.5));
		list2.add(new Stud(105,"Fathima",69.5));
		
		list.addAll(list2);
		
		list.forEach(s -> System.out.println(s));
		
		list.remove(1);
		
		System.out.println();
		list.forEach(s -> System.out.println(s));

		//list.removeAll(list2);
		list.retainAll(list2);
		
		System.out.println();
		list.forEach(s -> System.out.println(s));
		
		list.clear();
		
		System.out.println(list.isEmpty());
	}
}
