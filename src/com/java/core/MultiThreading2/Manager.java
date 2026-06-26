package com.java.core.MultiThreading2;

public class Manager implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <= 20; i++) {
			System.out.println("Manager working");
		}
		
		System.out.println("Manager thread name\n"+ Thread.currentThread());
	}

	
}
