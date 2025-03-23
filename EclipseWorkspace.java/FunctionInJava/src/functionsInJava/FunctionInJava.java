package functionsInJava;

public class FunctionInJava {
	
    // a. Function returns a value but does not accept parameters
    public int getNumber() {
        return 100;
    }

    // b. Function returns a value and accepts parameters
    public int add(int a, int b) {
        return a + b;
    }

    // c. Function does not return a value but accepts parameters
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // d. Function does not return a value and does not accept parameters
    public void greet() {
        System.out.println("Hello! Welcome to Java functions.");
    }

	public static void main(String[] args) {
        FunctionInJava obj = new FunctionInJava();

        // Calling function that returns a value but does not accept parameters
        int num = obj.getNumber();
        System.out.println("Returned number: " + num);

        // Calling function that returns a value and accepts parameters
        int sum = obj.add(19, 20);
        System.out.println("Sum: " + sum);

        // Calling function that does not return a value but accepts parameters
        obj.printMessage("This is Java!");

        // Calling function that does not return a value and does not accept parameters
        obj.greet();
		
		
		

	}

}

	
		


		/*
		 * Function/methods in Java:
		 *   
		 * <access_modifier> return_type function_name(parameter){
		 *       code 
		 * }
		 * 
		 * public void add(int a, int b){
		 *   syso(a+b);
		 * }
		 * 
		 * two:
		 *    1. built-in --> next(), nextLine(), println(), equals()
		 *    2. user defined:
		 *        a. function return a value not  accepting parameter.
		 *        b. function return a value and accept a parameter.
		 *        c.  function not return a value but accept a parameter.
		 *        d. function not returning s value also not accepting parameter
		 *   
		 */
