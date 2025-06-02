package com.mlabs.p2statement;

public class P2Bitwise {

	public static void main(String[] args) {
		
		byte a = 5;
		byte b = 6;
		
		System.out.println(a & b);
		/*
		 * 	5 	=> 0000 0101
		 * 	6 	=> 0000 0110
		 * -------------------
		 * 5&6	=> 0000 0100 => 4
		 */
		
		
		System.out.println(a | b);
		/*
		 * 	5 	=> 0000 0101
		 * 	6 	=> 0000 0110
		 * -------------------
		 * 5|6	=> 0000 0111 => 7
		 */
	}
}
