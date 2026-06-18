package com.java.core.exception.finalException;

public class Zomato {

	public static void orderFood(String city) {
		String currentCity = "PUNE";
		
		System.out.println("Select");
		if(!city.equalsIgnoreCase(currentCity)) {
			throw new InvalidCityException("Exception occured");
		}
		
		System.out.println("Quantity");
		System.out.println("Address");
		System.out.println("Payment");
		System.out.println("Status");
	}
}
