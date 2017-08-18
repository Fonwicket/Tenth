package Chapter_04;
import java.util.Scanner;

/**
 * The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area
 */
public class Exercise_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input
        System.out.println("Enter the side: ");
        double s = input.nextDouble();

          double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));


        // Result
        System.out.printf("The area of the hexagon is %5.2f", area);

    }
}
