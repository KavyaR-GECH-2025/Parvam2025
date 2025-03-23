package inheritence;

class Student1{
	public int age;
	public String name;
	public double marks;
	
	public Student1(int age, String name, double marks) {
		System.out.println("Full args Constructor");
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	
	public Student1() {
		System.out.println("no args constructor");
	}


	public void isPlaying() {
		System.out.println(this.name+ " is playing");
	}
	
	public void isSleeping() {
		System.out.println(this.name+ " is sleeping");
	}
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Marks: "+this.marks);
	}
}

public class ConstructorInJava {

	public static void main(String[] args) {
		Student1 std1 = new Student1(23,"Kavya",340.34);
		std1.display();
		Student1 std2 = new Student1();
		std2.display();

	}

}

// constructor is used create variable to instance variables
