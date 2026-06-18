package com.java.core.exception.finalException;

public class Test {

	public static void main(String[] args) {
		
		try {
			Zomato.orderFood("pune");
		}
		catch(InvalidCityException e) {
			System.err.println("Invalid city exception "+e);
		}
		System.out.println("IMP code");
		System.out.println("Exception handle");
	}

}
