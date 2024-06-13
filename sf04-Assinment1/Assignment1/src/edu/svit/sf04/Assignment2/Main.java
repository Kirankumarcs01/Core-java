package edu.svit.sf04.Assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Student object to invoke the default constructor
        Student student = new Student();

        // Create a Commission object
        Commision commissionEmployee = new Commision();

        // Accept details and calculate commission
        commissionEmployee.acceptDetails();
        commissionEmployee.calculateCommission();
		

	}

}
