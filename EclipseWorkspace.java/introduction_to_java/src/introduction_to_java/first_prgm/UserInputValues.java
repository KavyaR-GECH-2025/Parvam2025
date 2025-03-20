package introduction_to_java.first_prgm;

import java.util.Scanner;

public class UserInputValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Use a single Scanner object

        System.out.println("Enter student1 age:");
        int stdage = sc.nextInt();
        System.out.println("The age of student1 is: " + stdage);

        System.out.println("Enter student2 age:");
        byte stdage2 = sc.nextByte();
        System.out.println("The age of student2 is: " + stdage2);

        System.out.println("Enter student3 age:");
        short stdage3 = sc.nextShort();
        System.out.println("The age of student3 is: " + stdage3);

        sc.nextLine();  // Consume the leftover newline

        System.out.println("Enter a gender:");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Gender is: " + gender);

        sc.close();  // Close Scanner to free resources
    }
}
