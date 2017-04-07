package Chapter_02;

import java.util.Scanner;

/** Given an airplane’s acceleration a and take-off
     * speed v, you can compute the minimum runway length needed for an airplane to
     * take off using the following formula:
     *
     * length = v2 / (2 * a)
     *
     * Write a program that prompts the user to enter v in meters/second (m/s) and the
     * acceleration a in meters/second squared (m/s2), and displays the minimum runway
     * length.
     */



public class Excercise_02_12
{
    public static void main(String[] args)
    {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve V and acceleration
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        // Compute runway length
        double length = Math.pow(speed, 2) / (2 * acceleration);

        // Display the result
        System.out.println("The minimum runway length for this airplane is " + length);

    }
}
