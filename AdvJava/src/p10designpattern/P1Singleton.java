package p10designpattern;

class Singleton {
	
	private static Singleton instance;

	private Singleton() {
		// Private constructor to restrict instantiation
	}

	// Public static method to provide access to the instance
	public static Singleton getInstance() {
		// Create instance if it does not exist
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
		// Get the only instance of Singleton
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();

		// Verify if the instances are the same
		Singleton anotherSingleton = Singleton.getInstance();
		System.out.println("Are both instances equal? " + (singleton == anotherSingleton));
	}
}
