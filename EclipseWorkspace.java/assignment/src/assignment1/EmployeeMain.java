//3. Create an abstract class Employee with an name state and abstract method calculateSalary().
//   Create subclasses FullTimeEmployee and PartTimeEmployee that implement the method.

package assignment1;

// Abstract class
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeMain {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Kavya", 50000);
        Employee partTime = new PartTimeEmployee("Pallavi", 200, 20);

        fullTime.displayDetails();
        System.out.println("-----------------");
        partTime.displayDetails();
    }
}
