package arrayStringInJava.arrays;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of rows and cloumns");
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		
//		int [][] arr = new int [row][col];
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.println("Enter array element:");
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Array elements are:");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
	
		 // same code for charcter
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and cloumns");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		String[][] arr = new String [row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter array element:");
				arr[i][j] = sc.next();
			}
		}
		System.out.println("Array elements are:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}                 

}
