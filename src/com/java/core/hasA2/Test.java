package com.java.core.hasA2;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(101);
		e.setName("Rishi");
		e.setCity("Pune");
		
		AccountDetails ad = new AccountDetails();
		ad.setAccountNo(123456);
		ad.setBankName("IDBI");
		
		e.setDetails(ad);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		System.out.println(e.getCity());
		System.out.println(e.getDetails().getAccountNo());
		System.out.println(e.getDetails().getBankName());
	}

}
