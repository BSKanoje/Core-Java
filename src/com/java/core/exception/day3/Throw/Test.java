package com.java.core.exception.day3.Throw;


//throw handle runtime exception
public class Test {
	public static void main(String[] args) {
		int a = 12;
		
		if(a%2 == 0) {
			//even
			//arithmetic exception
			throw new ArithmeticException("Bad Number");
		}
		else {
			//odd
			System.out.println("Good Number");
		}
	}
}
