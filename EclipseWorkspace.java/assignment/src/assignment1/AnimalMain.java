// 4. Create an interface Animal with methods eat() and makeSound(). Implement this interface in Dog and Cat classes.

package assignment1;

// Interface
interface Animal {
    void eat();
    void makeSound();
}

// Dog class implementing Animal interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Cat class implementing Animal interface
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class
public class AnimalMain {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.eat();
        myDog.makeSound();

        System.out.println("-----------------");

        myCat.eat();
        myCat.makeSound();
    }
}
