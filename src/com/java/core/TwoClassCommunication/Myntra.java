package com.java.core.TwoClassCommunication;

public class Myntra {
	public static void main(String[] args) {
		
		Mens m = new Mens();
		System.out.println("Men Shirt details are: ");
		System.out.println("Brand name : "+m.brandName);
		System.out.println("Color : "+m.color);
		System.out.println("Price : "+m.price);
		System.out.println("Size : "+m.size);
		
		System.out.println("-------------");
		Womens w = new Womens();
		System.out.println("Women Saree details are: ");
		System.out.println("Brand name : "+w.brandName);
		System.out.println("Color : "+w.color);
		System.out.println("Cost : "+w.cost);
	}

}
