package final_this_super;

class Person1{
	public String name;
	public int age;
	
	//no-args
	public Person1() {
		System.out.println("Default constructor");
	}
	
	
	//all-args
	public Person1(String name, int age) {
		this();
		System.out.println("All agrs constructor");
		this.name = name;
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void display() {
		this.sayHello();
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
	}
	
}

public class ThisInJava {

	public static void main(String[] args) {
		/*
		 * This keyword:
		 * ============
		 * 1. used to refers instance variables current class.
		 * 2. used to refers current class constructor.
		 * 1. used to refers method in current class.
		 */
		
		Person1 p1 = new Person1("Kavya",23);

		p1.display();

	}

}
