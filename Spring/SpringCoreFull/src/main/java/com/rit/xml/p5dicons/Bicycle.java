package com.rit.xml.p5dicons;

public class Bicycle implements Vehicle{

	Tyre tyre;

	
	public Bicycle() {
		super();
	}

	public Bicycle(Tyre tyre) {
		super();
		this.tyre = tyre;
	}

	public String getVehicle() {
		return "Hi, Im using Bicycle !!!";
	}

	@Override
	public String getTyre() {
		return this.tyre.getTyre();
	}

}
