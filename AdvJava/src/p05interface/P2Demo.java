package p05interface;


interface IDemo2 {
	void greet();
	
	default int add(int a, int b) {
		return a+b;
	}
}


class CDemo2 implements IDemo2 {
	@Override
	public void greet() {
		System.out.println("Greetings");
	}
}


public class P2Demo {
	public static void main(String[] args) {
		CDemo2 obj = new CDemo2();
		obj.greet();
		System.out.println(obj.add(5, 7));
	}
}
