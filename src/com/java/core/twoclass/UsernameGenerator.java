package com.java.core.twoclass;

public class UsernameGenerator {
	
	public String getUserName(String fname, String lname, int yob) {
		
		int year = yob % 100;
		
		String userName = fname + lname + year;
		return userName;
	}

}
