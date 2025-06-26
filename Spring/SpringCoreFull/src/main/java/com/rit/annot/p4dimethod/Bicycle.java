package com.rit.annot.p4dimethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle{

	Tyre tyre;
	
	@Autowired
	public void myMethod(Tyre tyre) {
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
