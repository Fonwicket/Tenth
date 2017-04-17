package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that reads in investment amount, annual interest rate, and number of years, and
 * displays the future investment value using the following formula:
 * <p>
 * futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate) ,(numberOfYears*12))
 * <p>
 * For example, if you enter amount 1000, annual interest rate 3.25% , and number of years 1
 * the future investment value is 1032.98
 */
public class Exercise_02_21 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the amount, interest rate and years
        System.out.println("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;

        System.out.println("Enter number of years: ");
        double numberOfYears = input.nextDouble();

        // Compute the future investment value
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        // Display th results
        System.out.println("Accumulated value is " + futureInvestmentValue);
    }
}
