package com.java.core.MultiThreading;

public class Restaurant {
	public static void main(String[] args) {
		
		// cooking
		// serving

		Cook c = new Cook();
		c.start();
			
		for(int i = 0; i <= 20; i++) {
			System.out.println("ABHISHEKH is serving "+i+" : "+Thread.currentThread());
		}
	}
}

// HW: how to use runnable interface for multithreading