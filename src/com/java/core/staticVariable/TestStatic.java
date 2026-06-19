package com.java.core.staticVariable;

public class TestStatic {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.city);
		
		System.out.println(Student.name);
		Student.printAge();
		System.out.println(Student.name);
	}

}
