package final_this_super;

class Person3{
	public String name;
	public int age;
	
	public Person3(String name, int age) {
		super();
		System.out.println("This parent class constructor");
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name :"+this.name);
		System.out.println("Age :"+this.age);
	}
	
}

class Kavya1 extends Person3{
	public String eat;

	public Kavya1(String name, int age, String eat) {
		super(name, age);
		System.out.println("This child class constructor");
		this.eat = eat;
	}
	public void display() {
		super.display();
		System.out.println("Kavya eats :"+this.eat);
		System.out.println("Name of the person once again :"+super.name);
	}
	
}

public class SuperInJava {

	public static void main(String[] args) {
		/*
		 * SUPER:
		 * ======
		 * 1. it used to call super class instance variables.
		 * 2. it used to call  super class constructor.
		 * 3. it used to call super class method
		 */
		
		Kavya1 k1 = new Kavya1("Kavya",23,"rice");
		k1.display();
		

	}

}
