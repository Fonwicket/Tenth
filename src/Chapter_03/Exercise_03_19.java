package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that reads three edges for a triangle and computes the perimeter if the input is valid.
 * Otherwise, display that the  input  is  invalid.
 * The  input  is  valid  if  the  sum  of  every  pair  of  two  edges  is
 * greater than the remaining edge.
 * <p>
 * distance = mathpow( ​Mathpow((x2 - x1),2) + mathpow((y​2 - y1), ​2), 0.5)
 */
public class Exercise_03_19 {

    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the points of the triangle
        System.out.println("Enter the first point of the triangle (x1, y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter the second point of the triangle (x2, y2)");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter the third point of the triangle (x3, y3)");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Calculate the sides
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        // Validate input
        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) || (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) || (
                x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

        if (!valid) {
            System.out.println("Input is not valid");

        } else
            System.out.println("The perimeter of the triangle is " + (side1 + side2 + side3));

    }

}
