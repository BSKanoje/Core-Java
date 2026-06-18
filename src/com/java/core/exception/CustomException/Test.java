package com.java.core.exception.CustomException;

public class Test {

	public static void main(String[] args) {

		boolean value = false;
		
		if(value) {
			System.out.println("Chappal found");
		}
		else {
			throw new ChappalNotFoundException("No");
		}
		
		System.out.println("imp code");
	}

}
