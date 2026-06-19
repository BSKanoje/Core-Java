package com.java.core.paramConstr;

public class Student {
	
//	public Student() {
//		// default constructor
//		System.out.println("DEfault constructor...");
//	}
	
	public String name;
	public int age;
	
	public Student(String name, int age) {
//		System.out.println("Parameterized constructor...");
//		System.out.println(name);
		
		this.name = name;
		this.age = age;
	}
	
	public void printName() {
		System.out.println("Name is "+ name);
		System.out.println("Age is "+age);
	}
	
}
