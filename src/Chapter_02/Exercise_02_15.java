package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their
 * distance between them. The formula for computing the distance is
 * Math.pow((Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2),0.5)
 */
public class Exercise_02_15 {

    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve input values
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute distance
        double distance = Math.pow((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2), 0.5);

        // Display results
        System.out.println("The distance between the two points is: " + distance);
    }
}
