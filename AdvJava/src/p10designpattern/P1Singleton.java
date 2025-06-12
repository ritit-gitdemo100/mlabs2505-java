package p10designpattern;

class Singleton {
	
	private static Singleton instance;

	private Singleton() {}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}
}

public class P1Singleton {
	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();

		// Verify if the instances are the same
		Singleton anotherSingleton = Singleton.getInstance();
		System.out.println(singleton);
		System.out.println(anotherSingleton);
		System.out.println(singleton == anotherSingleton);
	}
}
