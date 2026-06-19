package com.java.core.arrays;

public class TestArray2 {

	public static void main(String[] args) {

		// impossible to determinate data
		Object[] abc = {"Ram", "String", false, 12, 23.34f, 34.43f, 'A'};
		
		for(int i = 0; i < abc.length; i++) {
			System.out.print(abc[i]+"  ");
		}
		
//		array of integers
		int[] a = {1, 2, 3, 4};
//		array of object of integers
		Integer[] aa = {3, 4, 5, 6, 7};
	}

}
