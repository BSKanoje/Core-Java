package com.java.core.exeption;

public class ExceptionBasics {

	public static void main(String[] args) {

		System.out.println("Start");
		
		String s = "apple";
		
		
		
		try {
			for(int i = 0; i <= s.length(); i++) {
				System.out.println(s.charAt(i));
			}
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("String value exceeded: "+e);
			e.printStackTrace();
		}
		
		System.out.println("End");
	}

}
