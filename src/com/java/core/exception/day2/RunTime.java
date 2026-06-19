package com.java.core.exception.day2;

import java.io.FileReader;

// un-checked exception
//error happen in unchecked exception

public class RunTime {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		String s = null;
		
		try {
			System.out.println(s.toLowerCase());
			System.out.println(a/b);
			FileReader f = new FileReader("abc.txt");
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
