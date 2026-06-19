package com.java.core.oops.abstraction.AbstractClass;

public class HR extends Employee {

	@Override
	public void getName() {
		System.out.println("HR");
	}

	@Override
	public void giveSalary(int salary) {
		salary = salary / 10;
		System.out.println("HR Salary = "+salary);
	}

}
