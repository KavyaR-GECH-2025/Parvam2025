package introduction_to_java.first_prgm;

public class Operators {

	public static void main(String[] args) {
		int a = 45;
		int b = 5;
		int c = 10;
		int result;
        boolean x = true;
        boolean y = false;
		
		//Arithmetic Operators
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		System.out.println("Addition :" +add);
		System.out.println("Substration :" +sub);
		System.out.println("Multiplication :" +mul);
		System.out.println("Divion :" +div);
		System.out.println("Modulus :" +mod);
		
		//Unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
        
        //Assignemt operators
        System.out.println("a += 3: " + (a += 3));
        System.out.println("a -= 2: " + (a -= 2));
        System.out.println("a *= 4: " + (a *= 4));
        System.out.println("a /= 3: " + (a /= 3));
        System.out.println("a %= 2: " + (a %= 2));
        
        //Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
        
        //Logical operators    
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        //Ternary operators
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
        
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
        
        //Shift operators
        // Using left shift
        System.out.println("a<<1 : " + (a << 1));
      
        // Using right shift
        System.out.println("a>>1 : " + (a >> 1));
        
        Person obj1 = new Person();
        Person obj2 = new Boy();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface));

        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface Myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface));
       
	}

}

//Classes and Interfaces used
//are declared here
class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}
