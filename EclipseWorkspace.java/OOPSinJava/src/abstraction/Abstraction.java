package abstraction;

//instance - object
// we cannot create object for abstrat class because it conatin abstract method
// we can create object for finall class but we cannot extends the class

//1.interface


interface Animal{
	public void eat();
}

class Lion implements Animal{
	
	@Override
	public void eat() {
		System.out.println("Lion wiill eat meat");
	}
}

//2.abstract class - we cann't create object for abstract

abstract class Vehicle{
	//abstract method
	public abstract void start();
	
	//Non-abstract method
	public void stop() {
		System.out.println("The vehicle is stopped");
	}
}
class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("The car is Started");
		
	}
	
 
}

public class Abstraction {

	public static void main(String[] args) {
		/*
		 * Abstraction:
		 * ============
		 * Abstraction is a process of hiding the implementation and showing only the essential resources.
		 * 
		 * 2. Ways :
		 * ========
		 * 1. Interface(it gives 100% abstraction/hiding)
		 * 2. Abstract class(0-100%)
		 */
		
		Lion l1 = new Lion();
		l1.eat();
		
		Car c1 = new Car();
		c1.start();
		c1.stop();

	}

}
