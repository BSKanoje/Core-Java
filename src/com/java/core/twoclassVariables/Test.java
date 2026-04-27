package com.java.core.twoclassVariables;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();
		s.id = 101;
		s.name = "Ram";
		s.city = "Pune";
		
		Student s1 = new Student();
		s1.id = 102;
		s1.name = "Shyam";
		s1.city = "Delhi";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);
	}

}
