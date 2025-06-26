package com.rit.xml.p6disetter;

public class Bicycle implements Vehicle{

	Tyre tyre;
	

	public void setTyre(Tyre tyre) {
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
