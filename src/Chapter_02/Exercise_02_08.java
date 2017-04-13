package Chapter_02;

import java.util.Scanner;

/**
 * Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time zone in GMT
 * Revise the program so it prompts the user to enter the time zone offset to GMT
 * and displays the time in the specified time zone.
 */
public class Exercise_02_08 {

    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the time zone offset
        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();


        // Obtain the total milliseconds since midnight, jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute teh current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours % 24) + offset;

        // Display the results
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond );


    }
}
