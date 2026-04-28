package com.java.core.conditionalStatement;

import java.util.Scanner;

public class LaddderIfCondition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 1 to 5 : ");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("one");
		}
		else if(n == 2) {
			System.out.println("two");
		} 
		else if (n == 3) {
			System.out.println("three");
		}
		else if(n == 4) {
			System.out.println("four");
		} 
		else if (n == 5) {
			System.out.println("five");
		}
		else {
			System.out.println("enter number between 1-5");
		}
	}

}
