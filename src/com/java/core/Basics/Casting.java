package com.java.core.Basics;

public class Casting {

	public static void main(String[] args) {
		// casting -> conversion from one datatype to another
		
		// implicit casting -> Conversion from small to large datatype
		int a = 10;
		double d = a;
		System.out.println("Value of d : "+d);
		
		
		// explicit casting -> Conversion from large to small datatype
		double b = 23.5;
		int z = (int) b;
		System.out.println("Value of z : "+z);
	}

}
