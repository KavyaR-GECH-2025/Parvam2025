package encapsulation;

class Student{
	private String name; // hiding data
	private int age;
	private double marks;
	
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
public class EncapsulationInJava {

	public static void main(String[] args) {
		/*
		 * Encapsulation:
		 * =============
		 * Encapsulation is a mechanism that binding the data into a single 
		 * Encapsulation is the process of hiding data within a class and only allowing access through getter and setter methods
		 */
		Student std1 = new Student();
		std1.setName("Kavya");
		System.out.println(std1.getName());

	}

}
