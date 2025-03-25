//5. Create a Shape class with a calculateArea() method. 
//   Create Circle and Rectangle subclasses that override this method to calculate and print their areas.


package assignment1;

// Base class
class Shape {
    public void calculateArea() {
        System.out.println("Area calculation not defined.");
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

// Main class
public class ShapeMain {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5);
        Shape myRectangle = new Rectangle(4, 6);

        myCircle.calculateArea();
        myRectangle.calculateArea();
    }
}
