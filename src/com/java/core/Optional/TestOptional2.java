package com.java.core.Optional;

import java.util.Optional;

public class TestOptional2 {
	
	public static void main(String[] args) {
		
		String name = null;
		
//		if(name != null) {
//			System.out.println(name.toUpperCase());
//		}
		
		Optional<String> nameOp = Optional.ofNullable(name);
		
		// default value
		// String nameFromOptional = nameOp.orElse("abhishek");
		
		try {
			String nameFromOptional = nameOp
					.orElseThrow(() -> new NullPointerException("name cant be null") );
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		//System.out.println(nameFromOptional.toUpperCase());
		
		System.out.println("Important code");
				
	}
}
