package com.java.core.MultiThreading2;

public class Test {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 20; i++) {
			System.out.println(Thread.currentThread()
								+" : "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		System.out.println("Main thread "+Thread.currentThread());
//		Manager m = new Manager();
//		
//		Thread t = new Thread(m);
//		t.start();
	}

}
