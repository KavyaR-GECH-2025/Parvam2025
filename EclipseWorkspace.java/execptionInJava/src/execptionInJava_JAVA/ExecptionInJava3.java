package execptionInJava_JAVA;

public class ExecptionInJava3 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("Your age is:"+age);
		}
	}

	public static void main(String[] args) {
		/*
		 * 
		 * finaly block:
		 * =============
		 * This will execute even if exception occur or not.
		 * where we have to write the closing code like db connection, file close.
		 */
	
		
//		  without handling the exception	
//		try {
//			System.out.println(10/0);
//		} finally {
//			System.out.println("This is finally block2");
//		}
		
		
//		  with handling the exception		
//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("This is finally block2");
//		}
		
		/*
		 * throw the exception
		 */
		validate(23);
		

	}

}
