package com.rit.xml.p7lifecycle;

public class Bicycle implements Vehicle{

	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

	public void method1() {
		System.out.println("Initializing Bean ");
	}
	
	public void method2() {
		System.out.println("Destroying Bean ");
	}
}
