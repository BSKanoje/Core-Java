package com.java.core.oops.abstraction.AbstractClass;

public class Client extends Employee {

	@Override
	public void getName() {
		System.out.println("Client");
	}

	@Override
	public void giveSalary(int salary) {
		System.out.println("no salary");
	}

}
