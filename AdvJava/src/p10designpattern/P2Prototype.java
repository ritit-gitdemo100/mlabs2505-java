package p10designpattern;

interface Prototype {
	Prototype clone();
}

class ConcretePrototype implements Prototype {
	private String name;

	public ConcretePrototype(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public Prototype clone() {
		return new ConcretePrototype(this.name);
	}

	@Override
	public String toString() {
		return "{" + name + "}";
	}
}

public class P2Prototype {
	public static void main(String[] args) {
		
		ConcretePrototype prototype1 = new ConcretePrototype("Anand");

		ConcretePrototype clonedPrototype = (ConcretePrototype) prototype1.clone();

		System.out.println("Original: " + prototype1);
		System.out.println("Cloned: " + clonedPrototype);

		System.out.println(prototype1 == clonedPrototype);
		System.out.println(prototype1.getName().equals(clonedPrototype.getName()));
	}
}
