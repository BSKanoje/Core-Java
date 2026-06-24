package com.java.core.Optional;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Integer a = 12;

		Optional<Integer> opA = Optional.of(a);
		
		System.out.println(a);
		System.out.println(opA);
		System.out.println(opA.get());
	}

}
