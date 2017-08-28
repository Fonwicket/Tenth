package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month
 */
public class Exercise_04_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month: ");
        String month = input.next();


        // Calculate days
        int days = 0;

        // select month
        String longmonth = "JanMarMayJulAugOctDec";
        String feb = "Feb";

        if (month.contains(feb)) {
            if (year % 4 == 0 || year % 100 == 0) {
                days = 29;
            } else {
                days = 28;
            }

        } else if (month.contains(longmonth)) {
            days = 31;
        } else {
            days = 30;
        }

        System.out.println(month + " " + year + " has " + days + " days");
    }
}


