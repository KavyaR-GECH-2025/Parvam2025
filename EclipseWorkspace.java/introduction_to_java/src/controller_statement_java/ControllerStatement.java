package controller_statement_java;

import java.util.Scanner;

public class ControllerStatement {

	public static void main(String[] args) {

		int a=30;
		int b=34;
		int c=35;
		
		if(a>=b) {
			System.out.println("a is greater than b");
		}
		else if(a>=c){
			System.out.println("a is greater than c");
		}
		else if(b>=c) {
			System.out.println("b is greater than c");
		}
		else {
			System.out.println("c is greater");
		}
		
		//switch
		
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day:");
        int day1 = sc.nextInt();
        switch(day1) {
        case 1,2,3,4,5 -> System.out.println("Weekdays");
        case 6,7 -> System.out.println("Weekends");
        default -> System.out.println("Invalid day");
        }
	}
}
        
//        System.out.println("Enter a number:");
//        int day = sc.nextInt();
//	
//		switch (day) {
//		case 1 -> System.out.println("Monday");
//		case 2 -> System.out.println("Tuesday");
//		case 3 -> System.out.println("Wednesday");
//		case 4 -> System.out.println("Thursday");
//		case 5 -> System.out.println("Friday");
//		case 6 -> System.out.println("Saturday");
//		case 7 -> System.out.println("Sunday");
//		default -> System.out.println("Invalid");
//		}
//		
        
//        System.out.println("Enter a number:");
//        int day1= sc.nextInt();
//	
//		switch (day1) {
//		case 1{
//			System.out.println("Monday");
//			break;
//		}
//		case 2 {
//			System.out.println("Tuesday");
//		}
//		case 3 {
//			System.out.println("Wednesday");
//		}
//		case 4 {
//			System.out.println("Thursday");
//		}
//		case 5 {
//			System.out.println("Friday");
//		}
//		case 6 {
//			System.out.println("Saturday");
//		}
//		case 7 {
//			System.out.println("Sunday");
//		}
//		default {
//			System.out.println("Invalid");
		

        
        
        
//	    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a day:");
//        int day1 = sc.nextInt();
//        String res = switch (day1) {
//        case 1,2,3,4,5 -> "weekdays";
//        case 6,7 -> "weekends";
//        default -> "Invalid";
//        };
//        System.out.println("The result is :" +res);




