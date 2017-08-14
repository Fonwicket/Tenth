package Chapter_03;

import java.util.Scanner;

/**
 * Suppose a right triangle is placed in a plane. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle.
 **/

public class Exercise_03_27 {

    public static void main(String[] args) {

        // Get input
        Scanner input = new Scanner(System.in);

        // Get the two points
        System.out.println("Enter a point's x- and y-coordinates: ");
        double xp = input.nextDouble();
        double yp = input.nextDouble();

        // Calculate in or out the triangle
        double x1 = 0;
        double y1 = 0;

        double x2 = 200;
        double y2 = 0;

        double x3 = 0;
        double y3 = 100;

        double alpha = ((y2 - y3)*(xp - x3) + (x3 - x2)*(yp - y3)) / ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
        double beta = ((y3 - y1)*(xp - x3) + (x1 - x3)*(yp - y3)) / ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
        double gamma = 1.0 - alpha - beta;



        Boolean withinTriangle = (alpha > 0 && beta > 0 && gamma > 0);




        // Display the result
        System.out.println("The point is " + ((withinTriangle) ? "in " : "not in ") + "the triangle");



    }

}
