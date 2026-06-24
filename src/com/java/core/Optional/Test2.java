package com.java.core.Optional;

import java.util.Optional;

public class Test2 {

	public static void main(String[] args) {
		String s = null;
		System.out.println(s);
		
		Optional<String> so = Optional.ofNullable(s);
		System.out.println(so.orElse("No value present"));		
		System.out.println("imp code");
	}

}
