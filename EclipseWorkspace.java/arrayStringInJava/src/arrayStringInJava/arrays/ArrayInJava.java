package arrayStringInJava.arrays;

import java.util.Scanner;

public class ArrayInJava {
	public static void main(String[] args) {
		/*
		 * Arrays in Java
		 * 
		 * If we want store a multiple values of the same datatypes we have to go for array.
		 * 
		 * how to declare the array:
		 *         <datatype> [] array_name = new <datatype>[size];
		 *         
		 *         int [] array1 = new int[4];
		 *         
		 * how to declare and initailize the array:
		 *        int  [] arr = {1,2,3,4,};
		 *        
		 * types:
		 *     1. 1D -> single row.
		 *        int [] array1 = new int[4];
		 *        
		 *     2. 2D -> in the form of table.
		 *        int [][] array1 = new int[4][3]; --> 4*3 = 12
		 *    
 		 */
        
		int[] arr = new int[5];
		//whenever we encounter the repetitive values we have to go for looping statements.
//		arr[0]=30;
//		arr[1]=40;
//		arr[2]=23;
//		arr[3]=54;
//		arr[4]=60;
		// arr[5] = 68;  --> array index out of bound exception
		
		for(int i=0;i<=4;i++) {
			arr[i] =10;
		}
		for(var i : arr) {	
			System.out.print(i+" "); // it used for print all values in one line
			//System.out.println(i+" "); it used for print every value in next lines
	    }
	}
}




