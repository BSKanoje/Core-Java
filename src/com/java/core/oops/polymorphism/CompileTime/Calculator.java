package com.java.core.oops.polymorphism.CompileTime;

// over loading / compile time polymorphism - method and constructor
	// method name should be same
	// parameter should be different
	// return type should be same

public class Calculator {

	public Calculator() {	
	}
	
	public Calculator(int a) {
	}

	public Calculator(String b) {
	}
	
	public void sum(int a, int b) {
		System.out.println("sum = "+(a+b));
	}
	
	public void sum(int a, int b, int c) {
		System.out.println("sum = "+(a+b+c));
	}
	
	// sequence of different data type should be matter
	public void sum(int a, String b) {
	}
	
	public void sum(String b, int a) {
	}
	
//	// return type doesnt matter so this is not polymorphism
//	// return type should be same
//	public int sum(int a, int b, int c) {
//		System.out.println("sum = "+(a+b+c));
//	}
}
