package execptionInJava_JAVA;

public class ExecptionInJava1 {

	public static void main(String[] args) {
		/*
		 * 2.unchecked exception
		 */
	
		//ArithmeticException
		 
		int a = 10;
		int b = 0;
		try {
			System.out.println("Result  is :"+(a/b));
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
		System.out.println("Hello World");
	}
		

}
