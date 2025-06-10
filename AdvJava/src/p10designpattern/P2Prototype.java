package p10designpattern;

//Prototype interface
interface Prototype {
	Prototype clone();
}

//ConcretePrototype class
class ConcretePrototype implements Prototype {
	private String name;

	// Constructor
	public ConcretePrototype(String name) {
		this.name = name;
	}

	// Getter
	public String getName() {
		return name;
	}

	// Implement the clone method
	@Override
	public Prototype clone() {
		return new ConcretePrototype(this.name);
	}

	@Override
	public String toString() {
		return "ConcretePrototype{name='" + name + "'}";
	}
}

public class P2Prototype {
	public static void main(String[] args) {
		ConcretePrototype prototype1 = new ConcretePrototype("Prototype1");

		// Clone the prototype object
		ConcretePrototype clonedPrototype = (ConcretePrototype) prototype1.clone();

		System.out.println("Original: " + prototype1);
		System.out.println("Cloned: " + clonedPrototype);

		// Verify if the objects are different instances but with the same state
		System.out.println("Are both objects the same instance? " + (prototype1 == clonedPrototype));
		System.out.println(
				"Do both objects have the same name? " + (prototype1.getName().equals(clonedPrototype.getName())));
	}
}
