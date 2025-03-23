package inheritence;

//1.single level
class Parent{
	int PData = 100;
	public void parentMethod() {
		System.out.println("This is parent method");
	}
	
//	private void parentMethod() {
//		System.out.println("This is parent method");
//	}
	
//	public void parentMethod() {
//	System.out.println("This is parent method");
//}
}
class Child2 extends Parent{
	int CData = 200;
	public void childMethod() {
		System.out.println("This is child method");
	}
	
//	private void childMethod() {
//		System.out.println("This is child method");
//	}
	
//	public void childMethod() {
//	System.out.println("This is child method");
//}
}

public class InheritenceInJava {

	public static void main(String[] args) {
		/*
		 * Inheritance:
		 * ===========
		 * extending the properties of parent class to child class.
		 * properties (state and actions)
		 * 
		 * only three method we can use static and public and default
		 * 
		 * Types:
		 * ------
		 * 1. single level : single parent single child
		 * 2. multilevel : multiple parent single child
		 * 3. heirarchical : single parent multiple child
		 * 4. hybrid: mixing of different inheritance (like inteface to child inheritance and parent class to child class inheritance)
		 * 5. multiple : not possible
		 */
		
    	Child2 child2 = new Child2();
		child2.parentMethod();
		child2.childMethod();
		System.out.println(child2.PData);
		System.out.println(child2.CData);

	}

}
