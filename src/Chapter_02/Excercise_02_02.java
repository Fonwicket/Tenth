package Chapter_02;

import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Write a program that reads the radius and length of a cylinder and computes
 * the area and volume using the following formulas:
 *
 * area = radius * radius * phi
 * volume = area * length
 *
 */
public class Excercise_02_02 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Receive the radius and the length
        System.out.println("Enter the radius and length of a cylinder");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // Compute the area
        double area = radius * radius * PI;

        // Compute the volume
        double volume = area * length;

        // Display the results
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
