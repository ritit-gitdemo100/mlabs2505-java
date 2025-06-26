package com.rit.annot.p4dimethod;

import org.springframework.stereotype.Component;

@Component
public class MRFTyre implements Tyre{

	public String getTyre() {
		return "Hi, Im using MRFTyre !!!";
	}

}
