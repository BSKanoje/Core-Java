package com.java.core.oops.abstraction.Interfaces;

public class Student implements College {

	@Override
	public void getFees() {
		System.out.println("25000");
	}

	@Override
	public void m1() {
		m4();
	}

}
