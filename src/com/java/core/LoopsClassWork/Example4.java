package com.java.core.LoopsClassWork;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isContinue = true;
		while(isContinue) {
			System.out.print("Enter a : ");
			int a = sc.nextInt();
			System.out.print("Enter b : ");
			int b = sc.nextInt();
			
			int sum = a + b;
			System.out.println("Addition is : "+sum);
			System.out.println("-------------------");
//			System.out.println("Do you want to continue (Y/N)");
//			String c = sc.next();
//			if(c == "Y") {
//				isContinue = false;
//			}
			
		}
		
	}

}
