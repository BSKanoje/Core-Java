package com.java.core.methodChaining;

public class Average {

	public int average(int math, int science, int eng) {
		
		Addition a = new Addition();
		int add = a.addMarks(math, science, eng);
		int avg = add / 3;
		return avg;
		
	}
}
