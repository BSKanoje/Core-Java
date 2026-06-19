package com.java.core.list;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();

		l.add("A");
		l.add("B");
		
		for( String s : l) {
			System.out.println(s);
		}

	}
}
