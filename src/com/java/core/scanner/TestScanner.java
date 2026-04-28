package com.java.core.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int
		System.out.print("Please enter your year of birth: ");
		int yob = sc.nextInt();
		System.out.println("Your year of birth is : " + yob);

		// String
		System.out.print("Enter city name :");
		String city = sc.next();
		System.out.println("City is : " + city);

		// String
		System.out.print("Enter full name :");
		String fullName = sc.nextLine();
		System.out.println("Full Name is : " + fullName);

		sc.close();
	}
}
