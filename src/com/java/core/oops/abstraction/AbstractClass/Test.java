package com.java.core.oops.abstraction.AbstractClass;

public class Test {

	public static void main(String[] args) {

		int salary = 10000;
		
		Employee emp;
		emp = new Developer();
		emp.getName();
		emp.giveSalary(salary);
		
		emp = new HR();
		emp.getName();
		emp.giveSalary(salary);
		
		emp = new Client();
		emp.getName();
		emp.giveSalary(salary);
		
		Employee e = new Employee() {
			
			@Override
			public void giveSalary(int salary) {
				// TODO Auto-generated method stub
				System.out.println(salary);
			}
			
			@Override
			public void getName() {
				// TODO Auto-generated method stub
				System.out.println("bush");
			}
		};
		e.giveSalary(salary);
		e.getName();
	}

}
