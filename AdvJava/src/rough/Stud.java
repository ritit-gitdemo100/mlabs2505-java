package rough;

public class Stud {
	int roll;
	String name;
	double mark;
	
	public Stud(int roll, String name, double mark) {
		super();
		this.roll = roll;
		this.name = name;
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "roll=" + roll + ", name=" + name + ", mark=" + mark;
	}

}
