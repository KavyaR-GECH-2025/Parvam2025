package final_this_super;


// class 
final class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}	
}
class Dog extends Animal{
	// we cannot extends that class
	
}

// method overriding

class Person{
	public final void walking() {
		System.out.println("The person is walking");
	}
	
}

class Kavya extends Person{
	public void walking() {
	     //cannot be override
	}
	




public class FinalInJava {
	public static void main(String[] args) {
		/*
		 * final -> we cannot change the value
		 * variables,method,class
		 * variables -> the variable value cannot be changed
		 * method -> we cannot override
		 * final class -> we cannot extends that class
		 */
		
		//variables
		final double PI = 3.14;
		System.out.println(PI);
		// PI = 4.14; we cannot be redeclare the value
		// System.out.println(PI);
		
	}
  
}
