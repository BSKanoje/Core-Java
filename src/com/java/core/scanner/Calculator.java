package com.java.core.scanner;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Sum is "+sum);
		
		int sub = a - b;
		System.out.println("Subtraction is "+sub);
		
		int pro = a * b;
		System.out.println("Product is "+pro);
		
		int div = a / b;
		System.out.println("division is "+div);
		
		sc.close();
	}
	
}
