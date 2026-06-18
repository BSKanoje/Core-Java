package com.java.core.exeption;

import java.util.Scanner;

public class ExceptionBasics2 {

	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a: ");
			int a = sc.nextInt();
			
			System.out.print("Enter b: ");
			int b = sc.nextInt();
			
			// try-catch
			
			try {
				System.out.println("Division: "+a/b);
			}
			catch(ArithmeticException e) {
				System.err.println("please do not enter b = 0");
			}
			System.out.println("-------------");
		}
		
	}

}
