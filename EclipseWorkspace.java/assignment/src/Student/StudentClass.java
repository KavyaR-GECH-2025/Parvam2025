package Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student<T>{
	public String name;
	public int roll_no;
	public int age;
	public double marks;
	public Student(String name, int roll_no, int age, double marks) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", age=" + age + ", marks=" + marks + "]";
	}
	
}

public class StudentClass {
	public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Kavya", 21,23,85.67),
                new Student("Pallavi",22,24,55.56),
                new Student("Suchithra",23,21,75.45),
                new Student("Indu",24,24,45.34),
                new Student("Ani",25,21,90.21)
            );

            List<Student> student = students.stream().filter(s -> s.marks> 60).collect(Collectors.toList());           // filter student who scored marks more than 60

            System.out.println("Students who scored above 60:\n");
            student.forEach(System.out::println);                    // for print every student in new line
          
		
	}

}
