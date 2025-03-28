package com.Collection.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * =========
		 * --> Array list is a improved version of array(dynamic array).
		 * --> Array list underline data structure as Dynamic array.  (Array list is uses dynamic array as internal data structure)
		 * --> Array list allow duplicate.
		 * --> Array list allow random acces(using index).
		 * --> Array list will allow null value 
		 * --> Array list will preserver the order of insertion
		 */
		
		ArrayList<Integer>  list = new ArrayList<Integer>();
		list.add(12);
		list.add(20);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		list.add(12);
		list.add(20);
		list.add(1);
		list.add(null);
		list.add(null);
		list.add(34);
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.size());
		
		//remove value by using index
		list.remove(1);
		
		//remove value by creating object
		Integer i = 34;
		list.remove(i);
		
//		list.clear();
		System.out.println(list);

	}

}
