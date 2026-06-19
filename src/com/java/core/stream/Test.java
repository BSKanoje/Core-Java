package com.java.core.stream;

public class Test {

	public static void main(String[] args) {

		Addition a = (int x, int y) -> {return (x+y);};
		
		System.out.println(a.add(12, 90));
		
		Addition ab = (x, y) -> {return x+y;};
	}

}
