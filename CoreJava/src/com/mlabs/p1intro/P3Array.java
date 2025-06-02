package com.mlabs.p1intro;

public class P3Array {
	
	public static void main(String[] args) {
		
		byte[] marks = {30,50,70,40,80};
		
		for (byte i=0; i<marks.length; i++) {
			if(marks[i] >= 50)
				System.out.println(marks[i]);
		}
		
	}
}

