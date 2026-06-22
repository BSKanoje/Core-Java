package com.java.core.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//employee and main missing in this pakage

public class TerminalOperators {
	public static void main(String[] args) {
		
		// Q. filter even numbers from list using stream api
		List<Integer> l = Arrays.asList(12,32,45,65,76,87,65,88);
		
		// 1. print even numbers -> forEach()
		l.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
		
		// 2. store filtered even number in another list
		List<Integer> evenList = l.stream().filter(x -> x%2==0).collect(Collectors.toList());
		System.out.println("Even number list: "+evenList);
		
		// 3.Count even number
		long count = l.stream().filter(x -> x%2 == 0).count();
		System.out.println("Even number count : "+count);
		
		// 4. find first even number
		Optional<Integer> firstEven = l.stream().filter(x -> x%2==0).findFirst();
		System.out.println("First even number : "+firstEven.get());
		
		// 5. find any even number from the list
		List<String> la = Arrays.asList("Tuesday", "Monday", "Mango", "Madrid", "Tuesday");
		Optional<String> anyEven = la.stream().filter(x -> x.startsWith("M")).findAny();
		System.out.println("Any word : "+anyEven.get());
		
		
		List<String> ls = Arrays.asList("Marigold", "Monday", "Mango", "Madrid", "Master","People");
		
		//6. are all the word starts with "M"? -> boolean
		Boolean flag = ls.stream().allMatch(x -> x.startsWith("M"));
		System.out.println("Start with M : "+flag);
		
		//7. any of the word starts with "P"? -> boolean
		Boolean flag2 = ls.stream().anyMatch(x -> x.startsWith("P"));
		System.out.println("Start with P : "+flag2);
		
		//8. is there any
		boolean flag3 = ls.stream().noneMatch(x -> x.startsWith("Z"));
		System.out.println("nonematch(): "+flag3);
		
		//9. store in set
		Set<Integer> evenSet = l.stream().filter(x -> x%2==0).collect(Collectors.toSet());
		System.out.println("Even number set: "+evenSet);
		
		//10. Store even number in array
		Object[] evenArray = l.stream().filter(x -> x%2==0).toArray();
		System.out.println("Even number array: "+evenArray);
		
	}
}
