package com.java.core.conditionalStatement;

public class NestedIfCondition {
	
	public static void main(String[] args) {
		int num = 50 ;
		
		if(num % 2 == 0) {
			System.out.println("Divisible by 2");
			
			if(num % 3 == 0) {
				System.out.println("Divisible by 3");
				System.out.println(num+" is Good number");
			}
			else {
				System.out.println(num+" is Bad number");
			}
		}
	}
	
}
