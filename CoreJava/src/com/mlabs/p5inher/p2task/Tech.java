package com.mlabs.p5inher.p2task;

public class Tech extends NonTech {

	String sub1;
	String sub2;
	String sub3;
	
	void namasteLondon(String sub1, String sub2, String sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	void preethiZindha() {
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
}
