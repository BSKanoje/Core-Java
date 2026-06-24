package com.java.core.maps;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {

		// key should be unique and only one null key 
		// value can be duplicate and null also
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(13312, "Shubham");
		m.put(null, "Akshay");
		m.put(null, "Akshay");
		m.put(1100, "xyz");

		System.out.println("Hash Map: random order: \n" + m);
	}

}
