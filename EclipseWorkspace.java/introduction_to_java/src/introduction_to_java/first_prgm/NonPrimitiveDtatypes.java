package introduction_to_java.first_prgm;

import java.util.Scanner;

public class NonPrimitiveDtatypes {

	public static void main(String[] args) {
//		int[] array1 = {1,2,3,4,5};
//		System.out.println(array1[2]);
//		
//		String name = "Kavya helloo";
//		System.out.println(name);
		
		Scanner sc = new Scanner(System.in);
//		sc.next();
//		sc.nextLine();
		
		
//		int stdage = 21;
//		double stdmarks = 200;
//		char stdgender = 'M';
//		String stdbranch = "CSE";
//		String stdaddress = "Hassan";
//		
		System.out.println("Enter a student name:");
		String stdname = sc.nextLine();
		System.out.println("Name :" +stdname);
		
		System.out.println("Enter a student age:");
		int stdage = sc.nextInt();
		System.out.println("Age:" +stdage);
		
		
		System.out.println("Enter a student marks:");
		double stdmarks = sc.nextDouble();
		System.out.println("Marks:" +stdmarks);
		
		System.out.println("Enter a student gender:");
		char stdgender = sc.next().charAt(0);
		System.out.println("Gender:" +stdgender);
		
		System.out.println("Enter a student branch:");
		String stdbranch = sc.nextLine();
		System.out.println("Branch : " +stdbranch);
		
		System.out.println("Enter a student address:");
		String stdaddress = sc.nextLine();
		System.out.println("Address : " +stdaddress);
		
	


	}

}
