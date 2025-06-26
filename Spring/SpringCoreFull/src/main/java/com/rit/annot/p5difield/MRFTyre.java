package com.rit.annot.p5difield;

import org.springframework.stereotype.Component;

@Component
public class MRFTyre implements Tyre{

	public String getTyre() {
		return "Hi, Im using MRFTyre !!!";
	}

}
