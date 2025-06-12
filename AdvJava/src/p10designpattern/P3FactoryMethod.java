package p10designpattern;

interface Vehicle {
	void drive();
}

class Car implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving a car");
	}
}

class Truck implements Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving a truck");
	}
}

interface VehicleFactory {
	Vehicle createVehicle();
}

class CarFactory implements VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}

class TruckFactory implements VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}


public class P3FactoryMethod {
	public static void main(String[] args) {
		
		VehicleFactory factory;
		String vehicleType = "truck";
		
		if(vehicleType.equalsIgnoreCase("car"))
			factory = new CarFactory();
		else
			factory = new TruckFactory();
		
		Vehicle vehicle = factory.createVehicle();
		vehicle.drive();
	}
}
