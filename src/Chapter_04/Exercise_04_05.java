package Chapter_04;
import java.util.Scanner;

/**
 * The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * area = (sides * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / sides));
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area
 */
public class Exercise_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input
        System.out.println("Enter the number of sides: ");
        double sides = input.nextDouble();

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

          double area = (sides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / sides)));


        // Result
        System.out.println("The area of the polygon is " + area);






    }
}
