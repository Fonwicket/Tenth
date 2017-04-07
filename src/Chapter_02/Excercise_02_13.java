package Chapter_02;

import java.util.Scanner;

/**
 * Suppose you save $100 each month
 * into a savings account with the annual interest rate 5%. Thus, the monthly interest
 * rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
 *
 * 100 * (1 + 0.00417) = 100.417
 *
 * After the second month, the value in the account becomes
 *
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 *
 * After the third month, the value in the account becomes
 *
 * (100 + 201.252) * (1 + 0.00417) = 302.507
 *
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after the sixth month. (In Exercise 5.30, you will use a
 * loop to simplify the code and display the account value for any month.)
 */

public class Excercise_02_13
{
    public static void main(String[] args)
    {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve saving amount
        System.out.println("Enter monthly savings amount: ");
        double amount = input.nextInt();

        // Compute amount after 6 months
        double increase = amount * (1 + 0.00417);
        increase = (amount + increase) * (1+0.00417);
        increase = (amount + increase) * (1+0.00417);
        increase = (amount + increase) * (1+0.00417);
        increase = (amount + increase) * (1+0.00417);
        increase = (amount + increase) * (1+0.00417);

        // Display the result
        System.out.println("After the sixth month, the account value is " + increase);

    }
}
