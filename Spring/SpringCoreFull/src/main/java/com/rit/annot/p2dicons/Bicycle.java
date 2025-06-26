package com.rit.annot.p2dicons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Bicycle implements Vehicle{

	Tyre tyre;
	
	
	public Bicycle() {
		super();
	}

	@Autowired
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
