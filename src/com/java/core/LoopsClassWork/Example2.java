package com.java.core.LoopsClassWork;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		// WAP to print table of input number
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print table: ");
		int n = sc.nextInt();
		
		System.out.println("Table of "+n+" is as follow -");
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}

}
