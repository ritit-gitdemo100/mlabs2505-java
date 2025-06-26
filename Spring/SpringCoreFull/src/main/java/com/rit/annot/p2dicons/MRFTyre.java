package com.rit.annot.p2dicons;

import org.springframework.stereotype.Component;

@Component
public class MRFTyre implements Tyre{

	public String getTyre() {
		return "Hi, Im using MRFTyre !!!";
	}

}
