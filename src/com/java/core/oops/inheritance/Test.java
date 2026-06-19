package com.java.core.oops.inheritance;

public class Test {

	public static void main(String[] args) {
		
		Zain zz = new Zain();
		System.out.println(zz.a);
		System.out.println(zz.b);
		System.out.println(zz.c);
		System.out.println(zz.d);
		System.out.println(zz.age);
		
		System.out.println("-----------------");
		Student s = new Student();
		System.out.println(s.age);
		
//		// parent class object 
//		Student s = new Student();
//		System.out.println(s.a);
//		
//		// child class object
//		Zain z = new Zain();
//		System.out.println(z.a);
//		System.out.println(z.b);
	}

}
