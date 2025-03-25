//2. Create a Vehicle base class with attributes like brand and speed, and a Car subclass that adds extra properties like numDoors.
//   Implement methods to display details.


package assignment1;

// Base class
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }
}

// Subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Main class
public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 180, 4);
        myCar.displayDetails();
    }
}
