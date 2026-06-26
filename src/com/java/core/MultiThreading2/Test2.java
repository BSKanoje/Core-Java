package com.java.core.MultiThreading2;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i <= 20; i++) {
			System.out.println("Hi");
		}
	}

}
