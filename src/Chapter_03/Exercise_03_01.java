package Chapter_03;
import java.util.Scanner;

/**
 * The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:
 * <p>
 * r1 = -b + √b2 - 4ac / 2a **r1 = -b + Math.pow(Math.pow(b,2)-(4*a*c),0.5) / 2 * a**
 * and r2 = -b - √b2 - 4ac / 2a **r2 = -b - Math.pow(Math.pow(b,2)-(4*a*c),0.5) / 2 * a**
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”.
 * Note that you can use Math.pow(x, 0.5) to compute √x
 */
public class Exercise_03_01 {

    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Get values for a, b and c
        System.out.println("Get a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Compute the discriminant
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        System.out.print("The equation has ");

        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        // Display correct output

        if (discriminant > 0) {
            System.out.println("two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            System.out.println("one root " + r1);
        } else {
            System.out.println("no real roots");
        }

    }
}
