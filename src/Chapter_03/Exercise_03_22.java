package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * <p>
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is
 * Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2),0.5)
 * Test your program to cover all cases.)
 */
public class Exercise_03_22 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the coordinate
        System.out.println("Enter a point with two coordinates: ");
        double x2 = input.nextInt();
        double y2 = input.nextInt();

        // Determine if point is in the circle with radius 10
        double distance = Math.pow(Math.pow(x2 - 0.0, 2) + Math.pow(y2 - 0.0, 2), 0.5);

        System.out.print("Point (" + x2 + ", " + y2 + ")");
        // Display the result
        if (distance <= 10.0) {
            System.out.println(" is in the circle.");

        } else
            System.out.println(" is not in the circle.");

    }
}
