package arrayStringInJava.arrays;

import java.util.Scanner;

public class Assignemnt1 {
	public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // Scanner for input
//        int[] arr1 = new int[5]; // Create an array of size 5
//
//        System.out.println("Enter 5 numbers:");
//        for (int i = 0; i < 5; i++) {
//            arr1[i] = sc.nextInt(); // Take input from user
//        }
//
//        System.out.print("Array: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr1[i] + " "); // Print array
//        }
		
		
		// Way 2 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter a values for array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" element:");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Arrays elements are:");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
				
		sc.close();
		
	}

}
