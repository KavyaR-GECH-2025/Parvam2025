//6. Student Grade System:
//=====================
//Create a Student class with private fields for name, rollNumber, and marks.
//
//Provide methods to get and set values.
//
//Implement a method to determine if the student has passed (marks >= 40).



package assignment1;

// Student class
class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to check if student has passed
    public boolean hasPassed() {
        return marks >= 40;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (hasPassed() ? "Passed" : "Failed"));
    }
}

// Main class
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 75);
        Student student2 = new Student("Bob", 102, 35);

        student1.displayDetails();
        System.out.println("-----------------");
        student2.displayDetails();
    }
}
