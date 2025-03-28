package com.Collection.java;

public class CollectionInJava {
	public static void main(String[] args) {
		/*
		 * why we need collection:
		 * =======================
		 * to over come the drawback of array we have to go for collection.
		 * 
		 * drawback of array:
		 * ======================
		 * 1.fixed size
		 * 2. same data type elements
		 * 3. we cannot reduce the size of an array
		 * 
		 * 
		 * advantages of array:
		 * =======================
		 * 1.random access
		 * 2.type safety - the elements inside the array is based on the data type
		 * 3.type casting - to print elements in array, no need to type cast
		 */
		
		int [] arr = new int[2];
		arr[0] = 12;
		arr[1] = 20;
		
		System.out.println((int)arr[0]);          // no need of type casting
		System.out.println(arr[1]);
	}

}
