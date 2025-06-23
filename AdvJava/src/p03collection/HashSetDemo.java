package p03collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
	int roll;
	String name;
	int mark;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mark=" + mark + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll == other.roll;
	}

	
}
public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<Student> hs = new HashSet<>();
		
		hs.add(new Student(101,"Raj",89));
		hs.add(new Student(102,"Raju",84));
		hs.add(new Student(101,"Rajan",89));
		hs.add(new Student(103,"Rajiv",79));
		hs.add(new Student(101,"Raj",89));
		
		hs.forEach(System.out::println);
		
	}
}
