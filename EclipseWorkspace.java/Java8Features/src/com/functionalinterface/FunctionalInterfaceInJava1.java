package com.functionalinterface;

@FunctionalInterface
interface Interface2{
	public void display();

}

@FunctionalInterface
interface Interface3{
	// public int getLength(String s);
	public int string(String s);
}

@FunctionalInterface
interface Interface4{
	public int add(int a, int b);

}


public class FunctionalInterfaceInJava1 {
	
	// with lambda expressions
	public static void main(String[] args) {
		Interface2 i = () -> System.out.println("Hello World");
		i.display();
		
		Interface3 j = s -> s.length();
		int res = j.string("Hello World");
		System.out.println("Lenght : "+res);
        System.out.println(j.string("Hello world")); 
		
		Interface4 k = (a,b) -> a+b;
		int add = k.add(10, 20);
		System.out.println("Addition: "+add);
		System.out.println("Addition : "+k.add(20, 30));;
	}

}
