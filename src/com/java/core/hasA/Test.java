package com.java.core.hasA;

public class Test {

	public static void main(String[] args) {
		Document d = new Document();
		d.setAadharNo("123456789");
		d.setLicense("L145263987");
		d.setPanNo("PAN123456");
		
		Student s = new Student();
		s.setRollNo(101);
		s.setFirstName("Kumar");
		s.setLastName("Patel");
		s.setCity("Pune");
		s.setDoc(d);
		
		System.out.println(s.getRollNo());
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getCity());
		System.out.println(s.getDoc().getAadharNo());
		System.out.println(s.getDoc().getLicense());
		System.out.println(s.getDoc().getPanNo());
	}
}
