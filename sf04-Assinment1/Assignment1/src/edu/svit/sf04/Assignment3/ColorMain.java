package edu.svit.sf04.Assignment3;

public class ColorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a Circle object
        Circle circle = new Circle();

        // Accept details of the circle
        circle.getInput();

        // Calculate and display the area of the circle
        circle.calcArea();

        // Display the color of the circle
        System.out.println("The color of the circle is: " + circle.getColor());
    }

}


