package com.java.core.arrays;

public class TestArray {

	public static void main(String[] args) {

		int[] heights = {10, 20, 30, 40, 50};
		//System.out.println(heights.toString());
		int len = heights.length;
		
		for(int i = 0; i < len; i++) {
			System.out.println(heights[i]);
		}
		System.out.println("--------------------------");
		
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int i = 0; i < days.length; i++) {
			if(days[i].startsWith("T")) {
				System.out.println(days[i]);
			}
		}
	}

}
