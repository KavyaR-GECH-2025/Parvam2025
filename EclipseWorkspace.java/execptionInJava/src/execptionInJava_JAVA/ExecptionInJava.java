package execptionInJava_JAVA;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExecptionInJava {

//  example for error:StackOverflowError
//	public static void display() {
//		display();
//	}
	
	public static void main(String[] args) throws FileNotFoundException{
		/*
		 * Exception in Java:
		 * =================
		 * there is a unwanted or unexpected event occur in the program.
		 * when ever there is exception the normal flow will stop.
		 * 
		 * 2 Types:
		 * ===========
		 * 1. checked exception(compile time) -> FileNotFoundException   ---> 1. I/O Exception, 2. ClassNotFound Exception, 3. SQL Exception
		 * 2. unchecked exception(runtime) ->arrayIndexOutBoundException ---> 1. Runtime Exception
		 * 
		 * Error:
		 * ======
		 * it is a problem where the program cann't handle it ex:StackOverflowError
		 */
		
		
//      error
//		ExecptionInJava.display();
		
		// checked exception
		// 1.try catch
		
//		try {
//			PrintWriter printWriter = new PrintWriter("abc.txt");
//			printWriter.println("Hello World");
//			System.out.println("Hello World");
//			printWriter.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e);
//		}
		
		// 2.throws
		PrintWriter printWriter = new PrintWriter("kavya.txt");
		printWriter.println("Hello World");
		System.out.println("Hello World");
		printWriter.close();


	}

}
