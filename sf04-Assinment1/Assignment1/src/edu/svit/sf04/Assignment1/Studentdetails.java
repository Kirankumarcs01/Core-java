package edu.svit.sf04.Assignment1;
import java.util.Scanner;


public class Studentdetails {
	
	
            public static void main(String[] args) {
	        // Create a Scanner object to read input from the console
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter their full name with initial
	        System.out.print("Enter your full name with initial: ");
	        String fullName = scanner.nextLine();

	        // Prompt the user to enter their roll number
	        System.out.print("Enter your roll number: ");
	        String rollNumber = scanner.nextLine();

	        // Prompt the user to enter their grade
	        System.out.print("Enter your grade: ");
	        String grade = scanner.nextLine();

	        // Prompt the user to enter their percentage
	        System.out.print("Enter your percentage: ");
	        String percentage = scanner.nextLine();

	        // Print the details entered by the user
	        System.out.println("\nStudent Details:");
	        System.out.println(fullName);
	        System.out.println(rollNumber);
	        System.out.println(grade);
	        System.out.println(percentage);

	        // Close the scanner
	        scanner.close();
	    }
	}



