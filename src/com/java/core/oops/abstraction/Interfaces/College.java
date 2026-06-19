package com.java.core.oops.abstraction.Interfaces;

public interface College {

	// no constructor
	// static and non static variable allowed
	// only abstract method allowed
	// 
	
	public void getFees();
	
	public void m1();
	
	// java 8
	public static void getTeacherFeedback() {
		
	}
	default void m4() {
		m2();
	}
	
	// java 9
	private void m2() {
		
	}
	
}
