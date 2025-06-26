package com.rit.xml.p5dicons;

public class Bike implements Vehicle{

	Tyre tyre;

	
	public Bike() {
		super();
	}

	public Bike(Tyre tyre) {
		super();
		this.tyre = tyre;
	}

	public String getVehicle() {
		return "Hi, Im using Bike !!!";
	}

	@Override
	public String getTyre() {
		return this.tyre.getTyre();
	}

}
