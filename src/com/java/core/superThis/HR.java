package com.java.core.superThis;

public class HR extends Employee {
	
	public HR() {
		System.out.println("HR constr");
		super.getAge();
		System.out.println(super.name);
		this.getAge();
		System.out.println(this.age);
	}
	
//	public HR(String a) {
//		super(900);
//		System.out.println("HR name "+a);
//	}
	
	public int age = 4000;
	
	public void getAge() {
		System.out.println("700");
	}
	public void something() {
		System.out.println("something called");
		System.out.println(super.age);
		System.out.println(super.name);
		getAge();
		super.getAge();
	}
}
