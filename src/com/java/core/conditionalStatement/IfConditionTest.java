package com.java.core.conditionalStatement;

import java.util.Scanner;

public class IfConditionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		
		if(n % 2 == 0) {
			System.out.println(n + " is Even number");
		}
		else {
			System.out.println(n + " is Odd number");
		}
	}

}
