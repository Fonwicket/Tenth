package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and dis
 * play the future day of the week.
 */
public class Exercise_03_05 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve 2 integers for the days
        System.out.println("Enter today's day: ");
        int today = input.nextInt();

        System.out.println("Enter the number of days elapsed since today:");
        int elapsedDay = input.nextInt();

        int futureDay = (today + elapsedDay) % 7;

        System.out.print("Today is ");

        switch (today) {
        case 0:
            System.out.print("Sunday");
            break;
        case 1:
            System.out.print("Monday ");
            break;
        case 2:
            System.out.print("Tuesday ");
            break;
        case 3:
            System.out.print("Wednesday ");
            break;
        case 4:
            System.out.print("Thursday ");
            break;
        case 5:
            System.out.print("Friday ");
            break;
        case 6:
            System.out.print("Saturday ");

        }

        System.out.print(" and the future day is ");

        // Determine futureday
        switch (futureDay) {
        case 0:
            System.out.print("Sunday");
            break;
        case 1:
            System.out.print("Monday");
            break;
        case 2:
            System.out.print("Tuesday");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5:
            System.out.print("Friday");
            break;
        case 6:
            System.out.print("Saturday");

        }
    }
}
