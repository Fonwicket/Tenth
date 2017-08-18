package Chapter_04;
import java.util.Scanner;

/**
 *  Suppose a pentagon is centered at (0, 0) with one point
 *  at the 0 o’clock position. Write a program that prompts
 *  the user to enter the radius of the bounding circle of a pentagon and displays the
 *  coordinates of the five corner points on the pentagon.
 */
public class Exercise_04_07 {
    public static void main(String[] args) {

        // input scanner
        Scanner input = new Scanner(System.in);

        // Get the radius of the circle
        System.out.println("Enter the radius of the bounding circle: ");
        double RADIUS = input.nextDouble();

        // Calculate the points
        double x1 = RADIUS * Math.sin(2.0 * Math.PI / 5.0 * 0);
        double y1 = RADIUS * Math.cos(2.0 * Math.PI / 5.0 * 0);
        double x2 = RADIUS * Math.sin(2.0 * Math.PI / 5.0 * 1);
        double y2 = RADIUS * Math.cos(2.0 * Math.PI / 5.0 * 1);
        double x3 = RADIUS * Math.sin(2.0 * Math.PI / 5.0 * 2);
        double y3 = RADIUS * Math.cos(2.0 * Math.PI / 5.0 * 2);
        double x4 = RADIUS * Math.sin(2.0 * Math.PI / 5.0 * 3);
        double y4 = RADIUS * Math.cos(2.0 * Math.PI / 5.0 * 3);
        double x5 = RADIUS * Math.sin(2.0 * Math.PI / 5.0 * 4);
        double y5 = RADIUS * Math.cos(2.0 * Math.PI / 5.0 * 4);





        // Display the result
        System.out.printf("The coordinates of five points on the pentagon are\n (%5.2f, %5.2f)\n(%5.2f, %5.2f)\n(%5.2f, %5.2f)\n(%5.2f, %5.2f)\n(%5.2f, %5.2f)\n", x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);


    }

}
