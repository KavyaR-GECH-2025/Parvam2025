package arrayStringInJava.arrays;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the character array:");
        int size = sc.nextInt(); // Taking array size
        char[] arr = new char[size]; // Creating a character array

        System.out.println("Enter characters:");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter character " + i + ":");
            arr[i] = sc.next().charAt(0); // Taking single character input
        }

        System.out.println("Character array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " "); // Printing characters
        }

        sc.close();
    }

	}



// write a prgm to take the user input  