package interfaceInJava;

interface Animal{
	public void makeSound();
}


class Dog implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}
	
class Cat implements Animal{
	
	public void makeSound() {
		System.out.println("Cat meows");
	

	}
}
	



public class InterfaceInJava {

	public static void main(String[] args) {
			/*
			 * Interface:
			 * =========
			 * It is blue print of class.
			 * The methods in the interface by default abstract(does not contain any body).
			 * From java 8 we can write default and static methods in interface.
			 * 
			 * how to declare interface
			 * =======================
			 * interface interface_name{
			 *      code
			 *  }
			 *  
			 *  ex:
			 *     interface Animal{ 
			 *         public void makeSound();
			 *      }  
			 *      
			 */
		
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		

	}

}
