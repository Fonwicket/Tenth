package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3)
 * of a triangle and display its area. The formula for computing the area of a
 * triangle is
 *
 * side# = Math.pow(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2), 0.5)
 *
 * s = (side1 + side2 + side3)/2
 *
 * area = Math.pow(s * (s - side1) * (s - side2) * (s - side3) , 0.5)
 */
public class Exercise_02_19 {

    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);

        // Retrieving the points
        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Compute the different sides
        double side1 = Math.pow(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2), 0.5);
        double side2 = Math.pow(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2), 0.5);
        double side3 = Math.pow(Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2), 0.5);

        // Compute the total of sides
        double s = (side1 + side2 + side3)/2;

        // Compute the area
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3) , 0.5);

        // Display the results
        System.out.println("The area of the triangle is " + area);





    }
}
