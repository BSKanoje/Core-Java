package com.java.core.twoclass;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// Requirement -> fname = John, lname = wick, yob = 1999
		// username = Johnwick99
		
		Scanner sc = new Scanner(System.in);
		
		UsernameGenerator ug = new UsernameGenerator();
		System.out.println("Enter first name, last name and year of birth :");
		String fname = sc.next();
		String lname = sc.next();
		int yob = sc.nextInt();
		
		String username = ug.getUserName(fname, lname, yob);
		System.out.println("Username is "+username);
		
		sc.close();
	}
}
