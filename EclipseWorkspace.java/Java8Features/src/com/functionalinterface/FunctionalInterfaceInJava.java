package com.functionalinterface;

@FunctionalInterface
interface Interface1{
	public void display();
}

class Display implements Interface1{

	@Override
	public void display() {
		System.out.println("Hello World");
		
	}
	
}
public class FunctionalInterfaceInJava {
	
	// without lambda expressions
	public static void main(String[] args) {
		Display d1 = new Display();
		d1.display();
	}

}
