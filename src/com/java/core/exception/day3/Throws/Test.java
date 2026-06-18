package com.java.core.exception.day3.Throws;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {

		Operation o = new Operation();
		try {
			o.division(12, 0);
		}
		catch(Exception e) {
			System.err.println("Exception happened ....");
		}
		
		System.out.println("VVIP code");
	
		try {
			o.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
