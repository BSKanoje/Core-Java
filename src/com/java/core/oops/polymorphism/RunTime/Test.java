package com.java.core.oops.polymorphism.RunTime;

public class Test {

	public static void main(String[] args) {
		
		String ip = "Developer";
		Employee e;
		if(ip.equals("Developer")) {
			e = new Developer();
			e.printSalary();
		}
		else {
			e = new HR();
			e.printSalary();
		}
	}

}
