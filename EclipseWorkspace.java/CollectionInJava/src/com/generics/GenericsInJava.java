package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {
	public static void main(String[] args) {
		/*
		 * Generics:
		 * ============
		 * it used to provide type safety and avoid type casting
		 * Syntax:
		 *     List<type of object> 
		 * 
		 * 
		 */
		
		char [] arr = {'a','b','c'};   //type safety
		char firstele = arr[0];  // without type casting(no required)
		System.out.println(firstele);
		
		//without generics
		List arr1 = new ArrayList();   // there is no type safety
		arr1.add(10);
		arr1.add(10.98);
		arr1.add("Kavya");
		String value = (String) arr1.get(2);  // explict type casting
		System.out.println(value);
		
		//generics
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(120);
		// list.add(10.67);
		int a = list.get(1);      // no need of type casting
		System.out.println(a);
		System.out.println(list);
		
	}

}
