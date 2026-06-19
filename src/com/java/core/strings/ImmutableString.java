package com.java.core.strings;

public class ImmutableString {

	public static void main(String[] args) {

		String pwd = "Friday.1234"; //SCP
		// Immutable - once created it cannot be changed
		
		String pwd2 = pwd.toUpperCase();
		System.out.println(pwd2);
		
		System.out.println(System.identityHashCode(pwd));
		System.out.println(System.identityHashCode(pwd2));
		
		if(pwd == pwd2) {
			System.out.println("Both strings are on same memory location");
		} else {
			System.out.println("Not at same memory location");
		}
	}

}
