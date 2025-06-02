package com.mlabs.p91exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked {
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
