package edu.svit.sf04.Bank;
import java.util.Scanner;
public class BankMain {
	
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);

		//Bank bank=new Bank();
	    System.out.print("Enter the bank details\n");
	    
      
        System.out.print("Enter your BankName: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter  IFSCCODE: ");
        String IFSCCODE = scanner.nextLine();

        // Prompt the user to enter their grade
        System.out.print("Enter LOcatoin: ");
        String location = scanner.nextLine();

        System.out.println(bankName );
		System.out.println(IFSCCODE);
		System.out.println("location");
		
	}

}
