package interfaceInJava;

interface interface1{
	
	public void method(); // abstract method - it does not contain any body
	
	public default void defaultMethod() { // default method
		System.out.println("This is a default method"); 
	}
	public static void staticMethod() {  // static method
		System.out.println("This is a static method");
	}
}
class Child1 implements interface1{
	public void method() {
		System.out.println("This is Method");
	}
	
}

public class InterfaceInJava2 {
	/*
	 * default and static method inside interface
	 * we can not access/ generate constructor in interface because  constructor is used to create objects but in inteface we cannot create an object of an interface,
	 */

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.method();
		child1.defaultMethod();
		interface1.staticMethod(); // we can access by interface in static method
		
	}


}
