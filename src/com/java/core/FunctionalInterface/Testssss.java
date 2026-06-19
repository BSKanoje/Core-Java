package com.java.core.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Testssss {

	public static void main(String[] args) {
		
		// Functional Interface - Predicate, BiPredicate<T, U>

		Predicate<Integer> p = (Integer t) -> t%2==0;
		System.out.println(p.test(9));
		
		Predicate<String> s = (z) -> z.startsWith("A");
		System.out.println(s.test("Anna"));
		
		// Functional Interface - Function, BiFunction<T, U, R>
		
		Function<Integer, Integer> sq = i -> (i*i);
		System.out.println(sq.apply(10));
		
		// Functional Interface - Consumer, BiConsumer<T, U>
		
		Consumer<String> c = ss -> System.out.println(ss.toLowerCase());
		c.accept("APPLE");
		
		// Functional Interface - Supplier
		
		Supplier<String> sup = () -> "www.myntra.com";
		System.out.println("MYntra URL: "+sup.get());

	}

}
