package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion)
 * and displays the number of years and days for the minutes.
 * For simplicity, assume a year has 365 days.
 */
public class Exercise_02_07 {

    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the number of seconds
        System.out.println("Enter a number of minutes: ");
        int minutes = input.nextInt();

        // Create constants of minutes in a year and a day
        final int YEAR_IN_MINUTES = 365 * 24 * 60;
        final int DAY_IN_MINUTES = 24*60;

        // Convert it to year and days
        int year = minutes / YEAR_IN_MINUTES;
        int remainingminutes = minutes % YEAR_IN_MINUTES;
        int day = remainingminutes / DAY_IN_MINUTES;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day  + " days");
    }
}
