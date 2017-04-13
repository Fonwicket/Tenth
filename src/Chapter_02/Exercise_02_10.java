package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that calculates the energy needed
 * to heat water from an initial temperature to a final temperature. Your program
 * should prompt the user to enter the amount of water in kilograms and the initial
 * and final temperatures of the water. The formula to compute the energy is
 * <p>
 * Q = M * (finalTemperature - initialTemperature) * 4184
 * <p>
 * where Mis the weight of water in kilograms, temperatures are in Celsius,
 * and energy Q is measured in Joules.
 */
public class Exercise_02_10 {
    public static void main(String[] args) {
        // Create a new input Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the input values, water, initial temperature and final temperature.
        System.out.println("Enter the amount of water in kilograms");
        double M = input.nextDouble();

        System.out.println("Enter the initial temperature");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature");
        double finalTemperature = input.nextDouble();

        // Compute the energy in Joules
        double Q = M * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + Q);
    }
}
