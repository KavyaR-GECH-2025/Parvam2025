package com.Collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.add(79);
		list.add(12);
		System.out.println("Before: "+list);
		
		/*
		 * Collections
		 * it is a utility classes that provides methods to work with collection
		 */
		
		//sort : for sorting above array list
		Collections.sort(list);
		System.out.println("After: "+list);
		
		// finding minimum value of array
		System.out.println("Min value: "+Collections.min(list));
		
		//maximum value
		System.out.println("Max value: "+Collections.max(list));
		
		// reversing array list
		Collections.reverse(list);
		System.out.println("Reverse arraylist: "+list);
		
		//repalce the array
		Collections.replaceAll(list,12,256);
		System.out.println("Repalce arraylist: "+list);
		
		
		
		
		
	}

}
