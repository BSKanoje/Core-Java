package com.java.core.exception.day3.Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Operation {

	public void division(int a, int b) throws Exception {
		int div = a/b;
		System.out.println(div);
		System.out.println("IMP code");
	}
	
	public void readFile() throws FileNotFoundException {
		FileReader f = new FileReader("abc.txy");
	}
}
