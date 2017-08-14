package Chapter_04;
import java.util.Scanner;

/**
 * OWrite a program that prompts the user to enter the length from the center of a pentagon to a vertex and
 * computes the area of the pentagon.
 * The formula for computing the area of a pentagon is
 * Area = 5*(side*side)/(4*TAN(PI()/5))
 *
 * where s is the length of a side. The side can be computed using the formula
 *
 * Side = 2* radius * SIN(PI()/5)
 * where r is the length from the center of a pentagon to a vertex. Round up two digits after the decimal point
 */
public class Exercise_04_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex: ");
        double radius = input.nextDouble();


        // Compute area
        double side = 2 * radius * Math.sin(Math.PI/5);


        double area = 5 * (Math.pow(side,2)) / (4 * Math.tan(Math.PI/5));


        // Result
        System.out.printf("The area of the pentagon is %3.2f", area);


    }
}
