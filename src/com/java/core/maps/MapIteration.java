package com.java.core.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {

		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		
		studentMap.put(101, "Ram");
		studentMap.put(102, "Sham");
		studentMap.put(103, "Gopal");
		studentMap.put(104, "Neha");
		studentMap.put(105, "Raghav");
		studentMap.put(106, "Abhijeet");
		studentMap.put(107, "Akash");
		studentMap.put(108, "Mansi");
		studentMap.put(109, "Renuka");
		
		// get() method
		//System.out.println(studentMap.get(109));
		
		// entrySet()
		//System.out.println(studentMap.entrySet());
		
		// case 1: entrySet()
		System.out.println("*********Entry set***********");
		for(Map.Entry<Integer, String> entry : studentMap.entrySet()) {
			System.out.println("Roll No: "+entry.getKey());
			System.out.println("Name: "+entry.getValue());
		}
		
		// case 2: keySet()
		System.out.println("*********Key set***********");
		for( Integer key : studentMap.keySet()) {
			System.out.println(key + " : " + studentMap.get(key));
		}
		
		// case 3: print only values from map -> values()
		System.out.println("*********values()***********");
		for(String name : studentMap.values()) {
			System.out.println(name);
		}

		// case 4: entrySet() with iterator
		System.out.println("**********iterator with entrySet()*********");
		Iterator<Map.Entry<Integer, String>> iterator = studentMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
		// case 5: keySet() method with iterator
		System.out.println("**********iterator with keySet()*********");
		Iterator<Integer> itr = studentMap.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(studentMap.get(key));
		}

	}

}
