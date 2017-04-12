package Chapter_02;

import java.util.Scanner;

/**
 * Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
 * weight in kilograms and dividing by the square of your height in meters. Write a program
 * that prompts the user to enter a weight in pounds and height in inches and displays the BMI
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */
public class Excercise_02_14 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Create static values
        final double POUND = 0.45359237;
        final double INCH = 0.0254;

        // Retrieve weight and height
        System.out.println("Enter weight in pounds");
        double weight = input.nextDouble() * POUND;
        System.out.println("Enter height in inches");
        double height = input.nextDouble() * INCH;


        // compute BMI
        double bmi = weight / (Math.pow(height,2));

        // display results
        System.out.println("BMI is " + bmi);

    }

}
