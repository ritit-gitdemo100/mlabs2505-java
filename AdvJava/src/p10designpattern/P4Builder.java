package p10designpattern;

class Computer {
	private String CPU;
	private String RAM;
	private String storage;
	private boolean isGraphicsCardEnabled;

	Computer(Builder builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", GraphicsCardEnabled="
				+ isGraphicsCardEnabled + "]";
	}
}

class Builder {
	String CPU;
	String RAM;
	String storage;
	boolean isGraphicsCardEnabled;

	// Builder methods for setting optional values
	public Builder setCPU(String CPU) {
		this.CPU = CPU;
		return this;
	}

	public Builder setRAM(String RAM) {
		this.RAM = RAM;
		return this;
	}

	public Builder setStorage(String storage) {
		this.storage = storage;
		return this;
	}

	public Builder enableGraphicsCard(boolean isEnabled) {
		this.isGraphicsCardEnabled = isEnabled;
		return this;
	}

	// Build method to construct the Computer object
	public Computer build() {
		return new Computer(this);
	}
}

public class P4Builder {
	public static void main(String[] args) {

		Computer computer = new Builder()
				.setCPU("Intel i9")
				.setRAM("16GB")
				.setStorage("1TB SSD")
				.enableGraphicsCard(true)
				.build();

		System.out.println(computer);
	}
}
