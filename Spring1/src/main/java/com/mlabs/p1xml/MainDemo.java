package com.mlabs.p1xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("p4xml.xml");

		Vehicle vehicle = context.getBean("vehInstance", Vehicle.class);
		vehicle.myVehicle();
	}

}
