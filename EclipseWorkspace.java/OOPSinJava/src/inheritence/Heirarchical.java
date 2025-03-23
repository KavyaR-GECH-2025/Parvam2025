package inheritence;

class Parentclass{
	public void parentMethod() {
		System.out.println("This is parent method");
	}
}

class Child1class extends Parentclass{
	public void child1Method() {
		System.out.println("This is child1 method");
	}
}

class Child2class extends Child1class{
	public void child2Method() {
		System.out.println("This is child2 method");
	}
}

public class Heirarchical {
	public static void main(String[] args) {
		
		Child2class c = new Child2class();
		c.parentMethod();
		c.child1Method();
		c.child2Method();
	}

}
