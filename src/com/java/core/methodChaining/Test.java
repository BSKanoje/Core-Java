package com.java.core.methodChaining;

public class Test {
	public static void main(String[] args) {
		
		Average a = new Average();
		int avg = a.average(98, 97, 99);
		System.out.println("Average : "+avg);
	}
}
