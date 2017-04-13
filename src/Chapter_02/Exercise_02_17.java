package Chapter_02;

import java.util.Scanner;

/**
 * How cold is it outside? The temperature alone is not enough to provide
 * the answer. Other factors including wind speed, relative humidity, and sunshine play
 * important roles in determining coldness outside. In 2001, the National Weather Service
 * (NWS) implemented the new wind-chill temperature to measure the coldness using
 * temperature and wind speed. The formula is
 * <p>
 * 35.74 + (0.6215 * temperature) - (35,75 * Math.pow(windSpeed, 0.16)) +
 * (0.4275 * temperature * Math.pow(windSpeed, 0.16))
 * <p>
 * The formula cannot be used for speeds below 2 mph or temperatures below -58°F or
 * above 41°F
 * <p>
 * Write a program that prompts the user to enter a temperature between -58F and 41F
 * and a wind speed greater than or equal to 2 and display the wind-chill temperature.
 */
public class Exercise_02_17 {
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the temperature and wind speed
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2 in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Compute the wind-chill temperature
        double windChill =
                35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math
                        .pow(windSpeed, 0.16));

        // Display the results
        System.out.println("The wind chill index is " + windChill);
    }
}
