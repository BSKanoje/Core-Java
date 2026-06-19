package com.java.core.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		// don't maintain insertion order sequence
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(234);
		s1.add(9000);
		s1.add(76543);
		s1.add(11);
		s1.add(null);
		System.out.println(s1);
		
		// maintain insertion order sequence
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(234);
		s2.add(9000);
		s2.add(76543);
		s2.add(11);
		s2.add(null);
		s2.add(9000);
		System.out.println(s2);
		
		// don't allow null value
		// sorted - ascending order
		Set<Integer> s3 = new TreeSet<Integer>();
		s3.add(234);
		s3.add(9000);
		s3.add(76543);
		s3.add(11);
		//s3.add(null);
		s3.add(9000);
		System.out.println(s3);

		
//		Set<String> s = new HashSet<String>();
//		s.add("Monday");
//		s.add("Tuesday");
//		s.add("Wednesday");
//		s.add("Thursday");
//		s.add("Monday");
//		s.add(null);
//		s.add("monday");
//		System.out.println(s);
	}
}
