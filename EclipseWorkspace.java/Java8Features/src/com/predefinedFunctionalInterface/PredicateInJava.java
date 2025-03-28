package com.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateInJava {
	public static void main(String[] args) {
		/*
		 * predicate
		 * ==========
		 * it will holds a condition
		 * 
		 */
		
		// need to find the number is even or odd
		Predicate<Integer> p = (a) -> a%2 == 0;
		System.out.println(p.test(22));
	}

}
