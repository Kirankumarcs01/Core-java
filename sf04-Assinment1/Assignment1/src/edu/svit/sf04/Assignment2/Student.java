package edu.svit.sf04.Assignment2;
import java.util.Scanner;
public class Student {
	
	 // Default constructor
    public Student() {
        System.out.println("Student object is created");
    }

}


  class Commision{
	 // Data members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Address: ");
        address = scanner.nextLine();

        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
      }
     // Method to calculate and display the commission
     public void calculateCommission() {
     double commission;

    if (salesAmount >= 100000) {
        commission = salesAmount * 0.10;
    } else if (salesAmount >= 50000) {
        commission = salesAmount * 0.05;
    } else if (salesAmount >= 30000) {
        commission = salesAmount * 0.03;
    } else {
        commission = 0;
    }

    System.out.println("Sales Amount: " + salesAmount);
    System.out.println("Commission: " + commission);
}
}
