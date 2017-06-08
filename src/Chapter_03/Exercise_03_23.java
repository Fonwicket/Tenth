package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter  a point (x, y) and checks whether
 * the point is within the rectangle centered at (0, 0) with width 10 and height 5.
 * For example, (2, 2) is inside the rectangle and
 * (6, 4) is outside the rectangle. (Hint: A point is in the
 * rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
 * vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
 * cover all cases.)
 */
public class Exercise_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = input.nextInt();
        int y = input.nextInt();

        // Calculate in or out the rectangle
        boolean withinRectangle = (Math.pow(Math.pow(x,2),0.5)<= 10/2) || (Math.pow(Math.pow(y,2),0.5) <= 5.0 / 2);

        System.out.println("Point (" + x + ", " + y + ") is " +
                ((withinRectangle) ? "in " : "not in ") + "the rectangle");



    }
}
