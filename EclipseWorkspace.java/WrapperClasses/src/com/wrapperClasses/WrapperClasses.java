package com.wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		/*
		 *  java is a pure oop or not:
		 *  ============================
		 *  --> no (because we cannot create object for primitive dataype in java)
		 *  
		 *  primitive sata types are:
		 *  	byte, short, int, long, float, double, char, boolean
		 *  
		 *  String name = new String("Kavya")      --> string is non primitive datatype
		 *  
		 *  collections:
		 *  ============
		 *  to store group of individual objects  as a single entity
		 *  
		 *  10,202,30,40 --->int (primitive datatype)
		 *  
		 *  
		 *  WRAPPER CLASSES:
		 *  ================
		 *  byte --> Byte
		 *  short -->Short
		 *  int --> Integer
		 *  long --> Long
		 *  float --> Float
		 *  double --> Double
		 *  char --> Character
		 *  boolean -->Boolean
		 *   
		 */
		
		// 1.Auto Boxing --> from primitive to Wrapper
		int a = 100;
		Integer i = Integer.valueOf(a);
//		Integer i = a;
		System.out.println("Int :"+a);
		System.out.println("Interger :"+i);
		System.out.println("Integer Type :"+i.getClass().getName());
		
		
		// 1.Unboxing  --> from wrapper to primitive
		Integer j = 10;
		int b = j.intValue();
//		int b = j;
		System.out.println("Int :"+b);
		System.out.println("Interger :"+j);
		System.out.println("Integer Type :"+j.getClass().getName());
		 
	
		
		//byte
		byte a1 = 100;
		Byte i1 = Byte.valueOf(a1);
//		Byte i1 = a1;
		System.out.println("byte :"+a1);
		System.out.println("Byte :"+i1);
		System.out.println("Bute Type :"+i1.getClass().getName());
		
		
		Byte j1 = 10;
		byte b1 = j.byteValue();
//		byte b1 = j1;
		System.out.println("byte :"+b1);
		System.out.println("Byte :"+j1);
		System.out.println("Byte Type :"+j1.getClass().getName());
		
		
        // short
        short a2 = 200;
        Short i2 = Short.valueOf(a2);
//        Short i2 = a2;
        System.out.println("Short :" + a2);
        System.out.println("Short :" + i2);
        System.out.println("Short Type :" + i2.getClass().getName());

        Short j2 = 20;
        short b2 = j2.shortValue();
//        short b2 = j2;
        System.out.println("Short :" + b2);
        System.out.println("Short :" + j2);
        System.out.println("Short Type :" + j2.getClass().getName());

        // float
        float a3 = 10.5f;
        Float i3 = Float.valueOf(a3);
//        Float i3 = a3;
        System.out.println("Float :" + a3);
        System.out.println("Float :" + i3);
        System.out.println("Float Type :" + i3.getClass().getName());

        Float j3 = 5.5f;
        float b3 = j3.floatValue();
//        float b3 = j3;
        System.out.println("Float :" + b3);
        System.out.println("Float :" + j3);
        System.out.println("Float Type :" + j3.getClass().getName());

        // double
        double a4 = 99.99;
        Double i4 = Double.valueOf(a4);
//        Double i4 = a4;
        System.out.println("Double :" + a4);
        System.out.println("Double :" + i4);
        System.out.println("Double Type :" + i4.getClass().getName());

        Double j4 = 55.55;
        double b4 = j4.doubleValue();
//        double b4 = j4;
        System.out.println("Double :" + b4);
        System.out.println("Double :" + j4);
        System.out.println("Double Type :" + j4.getClass().getName());

        // char
        char a5 = 'A';
        Character i5 = Character.valueOf(a5);
//        Character i5 = a5;
        System.out.println("Char :" + a5);
        System.out.println("Character :" + i5);
        System.out.println("Character Type :" + i5.getClass().getName());

        Character j5 = 'B';
        char b5 = j5.charValue();
//        char b5 = j5;
        System.out.println("Char :" + b5);
        System.out.println("Character :" + j5);
        System.out.println("Character Type :" + j5.getClass().getName());

        // boolean
        boolean a6 = true;
        Boolean i6 = Boolean.valueOf(a6);
//        Boolean i6 = a6;
        System.out.println("Boolean :" + a6);
        System.out.println("Boolean :" + i6);
        System.out.println("Boolean Type :" + i6.getClass().getName());

        Boolean j6 = false;
        boolean b6 = j6.booleanValue();
//        boolean b6 = j6;
        System.out.println("Boolean :" + b6);
        System.out.println("Boolean :" + j6);
        System.out.println("Boolean Type :" + j6.getClass().getName());
		
		
		
	}

}
