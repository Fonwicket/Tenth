package Chapter_02;

import java.util.Scanner;

/**
 * Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown
 * in the following formula
 * a=(v1 - v0) / t
 *
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second
 * the ending velocity v1 in meters/second, and the time span t in seconds
 * and displays the average acceleration.
 */
public class Exercise_02_09 {

    public static void main(String[] args) {
        // Create a new input Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the starting speed, end speed and time in seconds
        System.out.println("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        // Compute the average acceleration
        double averageAcceleration = (v1-v0) / t;

        // Display the results
        System.out.println("The average acceleration is " + averageAcceleration);


    }
}
