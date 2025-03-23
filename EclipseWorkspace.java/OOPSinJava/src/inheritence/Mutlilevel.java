package inheritence;

class GrandParentClass{
	public void grandParentMethod() {
		System.out.println("This is grand parent method");
	}
}

class ParentClass extends GrandParentClass{
	public void parentMethod() {
		System.out.println("This is parent method");
	}
}

class ChildClass extends ParentClass{
	public void childMethod() {
		System.out.println("This is child method");
	}
}

public class Mutlilevel {
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.grandParentMethod();
		cc.parentMethod();
		cc.childMethod();
		
		ParentClass pc = new ParentClass();
		pc.grandParentMethod();
		pc.parentMethod();
		
		GrandParentClass gp = new GrandParentClass();
		gp.grandParentMethod();
		
	}

}
