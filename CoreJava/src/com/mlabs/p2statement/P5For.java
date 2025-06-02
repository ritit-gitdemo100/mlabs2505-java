package com.mlabs.p2statement;

public class P5For {

	//for (init ; cond ; iter-expr)
	//0 or more => init
	//0 or 1 => cond
	//0 or more => iter-expr
	
	public static void main(String[] args) {
		
//		for (byte i=1; i<=5; i++)
//			System.out.println(i);
		
//		byte i=1;
//		for (  ; i<=5; i++)
//			System.out.println(i);
		
//		byte i=1;
//		for (  ; i<=5; ) {
//			System.out.println(i);
//			i++;
//		}
	
		byte i=1;
		for (  ; ; ) {
			
			if(i==5)
				break;
			
			System.out.println(i);
			i++;
		}
		
//		for (byte i=1,j=2,k=3; i<=5; i++,j--,k*=3)
//		System.out.println(i+" : "+j+" : "+k);
		
	}
}
