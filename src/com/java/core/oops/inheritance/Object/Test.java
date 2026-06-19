package com.java.core.oops.inheritance.Object;

public class Test {

	public static void main(String[] args) {

		Employee e = new HR();
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(e.age);
		// all variable from parent
		
		System.out.println("++++++++++++++");
		e.m1();
		e.m2();
		
		HR hr = new HR();
		System.out.println(hr.getClass());
	}

}
