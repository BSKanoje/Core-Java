package com.java.core.oops.abstraction.AbstractClass;

public class Developer extends Employee {

	@Override
	public void getName() {
		System.out.println("Developer");
	}

	@Override
	public void giveSalary(int salary) {
		salary = salary * 10;
		System.out.println("Dev Salary = " + salary);
	}
}
