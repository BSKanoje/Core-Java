package com.java.core.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,32,43,23,43,1);
		
		for(int a : l) {
			System.out.println(a);
		}
		
		//Consumer<Integer> c = x -> System.out.println(x);
		
		System.out.println("--------------------------");
		l.stream().forEach(x -> System.out.println(x));
		System.out.println("----------------------------");
//		l.stream().forEachOrdered(x -> System.out.println(x));
		
		System.out.println("Even Number");
		l.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
		System.out.println("----------------------------");

		
		l.stream()
		.filter(x -> x%2==0)
		.map(y -> y*10)
		.forEach(x -> System.out.println(x));
		
		
	
	}
}
