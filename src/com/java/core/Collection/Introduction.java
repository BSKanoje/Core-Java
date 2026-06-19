package com.java.core.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Introduction {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		l.add(12);
		l.add("SUYASH");
		l.add(false);
		System.out.println(l);
//		for(int i = 0; i< l.size(); i++) {
//		System.out.println(l.get(i));
//	}
		
		Set s = new HashSet();
		s.add("Monday");
		s.add("Tuesday");
		s.add("Wednesday");
		s.add("Thursday");
		System.out.println(s);
		
		Map<String, Integer> m = new HashMap();
		m.put("Ram", 98);
		m.put("Sham", 52);
		m.put("Riya", 88);
		m.put("Siya", 62);
		System.out.println(m);
		
	}

}
