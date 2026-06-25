package com.java.core.SingleThreading;

public class Restaurant {
	public static void main(String[] args) {
		
		// cooking
		// serving
		
		System.out.println(Thread.currentThread());
		
		for(int i = 0; i <= 20; i++) {
			System.out.println("Zain is cooking "+i);
		}
		
		for(int i = 0; i <= 20; i++) {
			System.out.println("Zain is serving "+i);
		}
		
		System.out.println(Thread.currentThread());

	}
}
