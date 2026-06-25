package com.java.core.maps;

import java.util.HashMap;
import java.util.Map;

public class MapIterationStream {

	public static void main(String[] args) {

Map<Integer, String> studentMap = new HashMap<Integer, String>();
		
		studentMap.put(101, "Ram");
		studentMap.put(102, "Akshay");
		studentMap.put(103, "Gopal");
		studentMap.put(104, "Neha");
		studentMap.put(105, "Raghav");
		studentMap.put(106, "Abhijeet");
		studentMap.put(107, "Akash");
		studentMap.put(108, "Mansi");
		studentMap.put(109, "Renuka");
		
		//entrySet() with stream()
		
		studentMap.entrySet().stream()
		.forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		System.out.println("--------------------");
		System.out.println("Student with odd roll number: ");
		
		// filter operation on keys
		studentMap.entrySet().stream()
		.filter(x -> x.getKey() %2 != 0)
		.forEach(x -> System.out.println(x.getKey()+" : "+x.getValue()));
		
		System.out.println("--------------------");
		System.out.println("Student name starting with A");
		
		// filter operation on values
		studentMap.entrySet().stream()
		.filter(x -> x.getValue().startsWith("A"))
		.forEach(x -> System.out.println(x.getKey()+" : "+x.getValue()));
		
		System.out.println("--------------------");
		// keySet()
		studentMap.keySet().stream().forEach(key -> System.out.println(studentMap.get(key)));
	}

}
