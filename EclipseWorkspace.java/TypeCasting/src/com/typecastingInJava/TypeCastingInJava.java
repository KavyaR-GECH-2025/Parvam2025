package com.typecastingInJava;

public class TypeCastingInJava {

	public static void main(String[] args) {
		/*
		 * Type Casting:
		 * =============
		 * conversion of one data type to another
		 * 
		 * 2 types:
		 * =========
		 * 1.implicit type casting:
		 * 		byte -> short -> int -> long -> float -> double
		 * 
		 * 2. explicit type casting:
		 * 		double -> float -> long -> int -> short -> byte
		 */
		
		
		// 1.implicit type casting:
		int a = 10;
		long a2 = a;
		
		System.out.println("Int :"+a);
		System.out.println("Long :"+a2);
		
		byte b = 8;
		short b1 = b;
		System.out.println("Byte :"+b);
		System.out.println("Short :"+b1);
		
		
		// 2. explicit type casting:
		long a3 = 10;
		int a4 = (int) a3;
		
		System.out.println("Int :"+a4);
		System.out.println("Long :"+a3);
		
		double b2 = 12.3;
		float b3 = (float) b2;
		
		System.out.println("Double :"+b2);
		System.out.println("Float :"+b3);

	}

}
