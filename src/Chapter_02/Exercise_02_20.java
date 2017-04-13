package Chapter_02;

import java.util.Scanner;

/**
 * If you know the balance an the annual percentage interest rate,
 * you can compute the interest on the next monthly payment using the following formula:
 * <p>
 * interest = balance * (annualInterestRate/1200)
 * <p>
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month.
 */
public class Exercise_02_20 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve balance and interest rate
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // Compute the interest
        double interest = balance * (annualInterestRate / 1200);

        // Display the results
        System.out.println("The interest is " + interest);
    }
}
