package com.java.core.stringDayTwo;

public class TestOne {

	public static void main(String[] args) {

		String s = "WEDNESDAY";
		
		
		for(int i = 0; i < s.length(); i++) {
//			if(i % 2 == 0) {
//				System.out.print(s.charAt(i) + "  ");	
//			}
			System.out.print(s.charAt(i) + "  ");
		}
		System.out.println();
		System.out.println("-------------------------");
		
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i)+ "  ");
		}
	}

}
