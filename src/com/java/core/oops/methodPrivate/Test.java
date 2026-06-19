package com.java.core.oops.methodPrivate;

public class Test {
	public static void main(String[] args) {
		//getAge();
		m1();
	}
	
	public void something() {
		getAge();
	}
	
	private void getAge() {
		System.out.println(23);
	}
	
	public static void m1() {
		
	}
}
