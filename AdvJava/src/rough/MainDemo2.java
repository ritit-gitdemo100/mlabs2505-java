package rough;

import java.util.ArrayList;
import java.util.Iterator;

public class MainDemo2 {
	public static void main(String[] args) {
		
		Stud s1 = new Stud(101,"Abdul",79.5);
		Stud s2 = new Stud(102,"Karthik",44.5);
		Stud s3 = new Stud(103,"Joseph",59.5);
		Stud s4 = new Stud(104,"Dhoni",83.5);
		Stud s5 = new Stud(105,"Fathima",69.5);
	
		ArrayList<Stud> list = new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Stud> it = list.iterator();
		while(it.hasNext()) {
			Stud stud = it.next();
			if(stud.name.endsWith("i"))
				System.out.println(stud);
		}
		
	}
}
