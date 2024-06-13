package edu.svit.sf04.Assignment3;
import java.util.Scanner;
public class Circle {
	 // Data members
    private double radius;
    private String color;

    // Method to accept the details of the circle
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        System.out.print("Enter the color of the circle: ");
        color = scanner.next();

        scanner.close();
    }

    // Method to calculate and display the area of the circle
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    // Getter method for the color
    public String getColor() {
        return color;
    }

}
