package interfaceInJava;

interface A{
	public void method();
}

interface B{
	public void method();

}

class Child implements A,B{
	
	public void method() {
		System.out.println("This is method from A and B interface");
	}
	
//	public void method() {
//		System.out.println("This is method B");
//	}
}

public class InterafceInJava1 {
	
	public static void main(String[] args) {
		
		Child child = new Child();
//		child.methodA();
//		child.methodB();
		child.method();
	}

}
	



