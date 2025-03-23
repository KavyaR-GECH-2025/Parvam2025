package inheritence;  // Fixed spelling (inheritence → inheritance)

interface Interface3 {  // Interface names should start with uppercase (Java convention)
    void interfaceMethod();
}

class PClass {  // Class names should start with uppercase
    public void parentMethod() {  // Fixed method name (camelCase)
        System.out.println("This is parent method");
    }
}

class Child extends PClass implements Interface3 {
    public void childMethod() {  // Fixed method name (camelCase)
        System.out.println("This is child method");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("This is interface method");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Child c = new Child();
        c.childMethod();
        c.parentMethod();   // Fixed method call (camelCase)
        c.interfaceMethod();
    }
}
