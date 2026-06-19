package com.java.core.LoopsClassWork;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// only 3 free addition are permitted
		// then buy a premium
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("Enter a : ");
			int a = sc.nextInt();
			System.out.print("Enter b : ");
			int b = sc.nextInt();
			
			int sum = a + b;
			System.out.println("Addition is : "+sum);
			System.out.println("=================================");
		}
		sc.close();
		System.err.println("Please buy a premium");
	}

}
