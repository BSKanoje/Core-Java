package com.java.core.Optional;

import java.util.Optional;

public class TestOptional {
	
	public static void main(String[] args) {
		
//		Case 1: we are sure there will be no null value
		
		String fname = "Bushra";
		System.out.println(fname);
		
		Optional<String> optionalFname = Optional.of(fname);
		System.out.println(optionalFname);
		System.out.println("-------------------------");
		
//		Case 2: There is possibility of null value
		
		String city = null;
		System.out.println("City: "+city);
		
		Optional<String> optionalCity = Optional.ofNullable(city);
		System.out.println(optionalCity);
		
				
	}
}
