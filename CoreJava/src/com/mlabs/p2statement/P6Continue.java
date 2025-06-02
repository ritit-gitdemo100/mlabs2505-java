package com.mlabs.p2statement;

public class P6Continue {
	
	public static void main(String[] args) {
		
	
		byte count = 0;
		while(count < 10) {
			
			count++;

			if(count==5)
				continue;
			
			System.out.println(count);
		}
		System.out.println("End");
		
	}
}
