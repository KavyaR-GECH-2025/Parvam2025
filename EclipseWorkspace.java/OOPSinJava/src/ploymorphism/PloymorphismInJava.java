package ploymorphism;

// static method we cannot override but we can overload
//final method we cannot override but we can overload
// 1. method-overriding : A subclass provides a new implementation for a method already defined in the parent class.
class Person{
	static void walking() {
		System.out.println("The person is walking");
	}
	
}

class Kavya extends Person{
	static void walking() {
		System.out.println("Kavay is walking");
	}
	
}

// 2. method-overloading :Multiple methods with the same name but different parameters in the same class.

class Addition{
	static void add(int a,int b) {
		System.out.println("Addition is :"+(a+b));
	}
	static void add(int a,int b,int c) {
		System.out.println("Addition is :"+(a+b+c));
	}
}

public class PloymorphismInJava {

	public static void main(String[] args) {
		/*
		 * Ploymorphism:
		 * ============
		 * poly -> many
		 * morphism -> forms
		 * it a mechansim that methods will perform a different actions based on the situation.
		 * 
		 * 2 TYPES:
		 *   1. method-overloading --> one class
		 *   2. method-overriding -->two class
		 * 
		 */
		
		// 1. method-overriding/dynamic polymorphism/runtime polymorphism
		// Kavya k1 = new Kavya();
		Kavya.walking();
		
	   //2. method-overloading/compiletime polymorphism/static polymorphism
//		Addition a1 = new Addition();
		Addition.add(10,20);
		Addition.add(10,20,30);

	}

}
