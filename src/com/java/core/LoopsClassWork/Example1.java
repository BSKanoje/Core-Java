package com.java.core.LoopsClassWork;

public class Example1 {

	public static void main(String[] args) {

		// Q - find even numbers from 1 to 30
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("----------------------------------");
		
		int i = 1;
		while(i <= 30) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
