package com.java.core.oops.polymorphism.RunTime;

// Runtime polymorphism / overriding
	// 2 different classes but should have parent-child relation (inheritance)
	// only methods can be overridden
	// constructor cannot be override
	// static method do not override
	// private method do not override
public class Employee {

	public Employee() {
	}
	
	public void printSalary() {
		System.out.println("Salary of employee ");
	}
	
	public static void printAge() {
		System.out.println("Age");
	}
}
