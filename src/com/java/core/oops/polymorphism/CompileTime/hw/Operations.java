package com.java.core.oops.polymorphism.CompileTime.hw;

public class Operations {

	public void sum(int a, int b) {
		System.out.println("sum = "+(a+b));
	}
	public void sum(int a, int b, int c) {
		System.out.println("sum = "+(a+b+c));
	}
	public void sum(int a, int b, int c, int d) {
		System.out.println("sum = "+(a+b+c+d));
	}
	public void sum(int a, int b, int c, int d, int e) {
		System.out.println("sum = "+(a+b+c+d+e));
	}
	
	
	public void subtract(int a, int b) {
		System.out.println("subtract = "+(a-b));
	}
	public void subtract(int a, int b, int c) {
		System.out.println("subtract = "+(a-b-c));
	}
	public void subtract(int a, int b, int c, int d) {
		System.out.println("subtract = "+(a-b-c-d));
	}
	public void subtract(int a, int b, int c, int d, int e) {
		System.out.println("subtract = "+(a-b-c-d-e));
	}
}
