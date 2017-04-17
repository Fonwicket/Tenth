package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the distance to drive,
 * the fuel efficiency of the car in miles per gallon, and the price per
 * gallon, and displays the cost of the trip
 */
public class Exercise_02_23 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the driving distance
        System.out.println("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();

        // Retrieve the miles per gallon
        System.out.println("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        // Retrieve the price per gallon
        System.out.println("Enter price per gallon");
        double pricePerGallon = input.nextDouble();

        // Calculate the driving costs
        double gallonUsed = drivingDistance / milesPerGallon;
        double farePrice = gallonUsed * pricePerGallon;

        // Display the results
        System.out.println("The cost of driving is " + farePrice);
    }

}

