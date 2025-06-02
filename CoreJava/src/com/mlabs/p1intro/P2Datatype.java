package com.mlabs.p1intro;

public class P2Datatype {
	
	public static void main(String[] args) {
		
		byte age = 78;
		short totalMark = 478;
		int salary = 2000000000;
		long population = 800000000L;
		
		float cost = 3456.12345678912345F;
		
		System.out.println(age);
		System.out.println(totalMark);
		System.out.println(salary);
		System.out.println(cost);
		
		for(byte i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}

// primitive types
// 1 byte 	- byte -128 to 127, 
// 2 bytes 	- short -32768 to 32767, 
// 4 bytes 	- int 2146483648, 
// 8 bytes 	- long
// 4 bytes 	- float,     .6 decimal digit accuracy
// 8 bytes 	- double	 .12 
// 2 bytes 	- char, 
// 1 byte	- boolean