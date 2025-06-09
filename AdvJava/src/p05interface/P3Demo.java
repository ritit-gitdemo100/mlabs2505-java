package p05interface;


interface IDemo3 {
	void greet();
	
	default int add(int a, int b) {
		return a + b;
	}
	
	static int prod(int a, int b) {
		return a * b;
	}
}


class CDemo3 implements IDemo3 {
	@Override
	public void greet() {
		System.out.println("Greetings");
	}
}


public class P3Demo {
	public static void main(String[] args) {
		CDemo3 obj = new CDemo3();
		obj.greet();
		System.out.println(obj.add(5, 7));
		System.out.println(IDemo3.prod(5, 7));
	}
}
