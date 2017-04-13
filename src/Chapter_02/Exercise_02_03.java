package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that reads a number in feet, converts it to meters and displays the result.
 * One foot is 0.305 meter.
 */
public class Exercise_02_03 {
    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);

        // Create constant value
        final double METERS_PER_FOOT = 0.305;

        // Retrieve the number of feet
        System.out.println("Enter a number of feet: ");
        double feet = input.nextDouble();

        // Convert it to meters
        double meter = feet * METERS_PER_FOOT;

        // Display the result
        System.out.println(feet + " feet is " + meter + " meters");
    }
}
