package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the side of
 * a hexagon and displays its area. The formula for computing
 * the area of a hexagon is
 * (3 * Math.pow(3,0.5) / 2) * Math.pow(side, 0.5)
 *
 */
public class Exercise_02_16 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the side
        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        // Compute the area
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);

        // Display the result
        System.out.println("The area of the hexagon is " + area);

    }
}
