package concrete_pojo;

class Person{
	private String name;
	private int age;
	private double marks;
	
	public Person(String name, int age, double marks) {
		this();
		System.out.println("all-agrs constructor");
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public Person() {
		System.out.println("no-agrs constructor");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
}

public class POJO {

	public static void main(String[] args) {
		/*
		 * POJO Class:
		 * =============
		 * plain old java object(POJO)
		 * rules:
		 * ======
		 * 1. the class is should not extends or implements any class or interface.
		 * 2. every fields(state/properties) should be private
		 * 3. all-args constructor
		 * 4. no-agrs constructor
		 * 5. toString()
		 * 6. getter and setter public method
		 */
		Person p1 = new Person("kavya",23,304.23);
        System.out.println(p1);
        p1.setName("Suchithra");
        p1.setAge(24);
        p1.setMarks(340.89);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getMarks());

		
	}

}

