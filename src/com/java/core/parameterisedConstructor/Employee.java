package com.java.core.parameterisedConstructor;

public class Employee {

	// global or instance variable
	int age = 12;
	
	public Employee() {
		System.out.println("In employee constructor");
	}
	
	public void printName() {
		// local variable
		String name = "Akash";
		System.out.println(name);
	}
	
	public void printAge() {
		System.out.println(age);
	}
}
