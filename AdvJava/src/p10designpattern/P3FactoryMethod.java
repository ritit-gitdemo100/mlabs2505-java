package p10designpattern;

//Vehicle interface
interface Vehicle {
	void drive();
}

//Concrete Vehicle classes
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

//Factory interface
interface VehicleFactory {
	Vehicle createVehicle();
}

//Concrete Factory classes
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
		
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.drive();

		VehicleFactory truckFactory = new TruckFactory();
		Vehicle truck = truckFactory.createVehicle();
		truck.drive();
	}
}
