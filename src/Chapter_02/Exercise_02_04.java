package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that converts pounds into kilograms
 * The program prompts a user to enter a number in pounds, converts it to kilograms
 * and displays the result. One pound is 0.454 kilograms
 */
public class Excercise_02_04 {
    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);

        // Create constant
        final double POUND_TO_KILOGRAM = 0.454;

        // Retrieve the number of pounds
        System.out.println("Enter a number in pounds: ");
        double pound = input.nextDouble();

        // Convert it to kilo's
        double kilo = pound * POUND_TO_KILOGRAM;

        // Display the result
        System.out.println(pound + " pound is " + kilo + " kilograms");
    }
}
