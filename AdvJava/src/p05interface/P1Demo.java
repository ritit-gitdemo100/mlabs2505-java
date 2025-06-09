package p05interface;


interface IDemo1 {
	void greet();
}


class CDemo1 implements IDemo1 {
	@Override
	public void greet() {
		System.out.println("Greetings");
	}

	
}


public class P1Demo {
	public static void main(String[] args) {
		CDemo1 obj = new CDemo1();
		obj.greet();
	}
}
