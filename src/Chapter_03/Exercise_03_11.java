package Chapter_03;
import java.util.Scanner;

/**
 * Write  a  program  that  prompts  the  user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 had 29 days. If the user entered month 3 and year 2015,
 * the program should display that March 2015 had 31 days.
 */

public class Exercise_03_11 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the month
        System.out.println("Give the month number: ");
        int month = input.nextInt();

        // Retrieve the year
        System.out.println("Give the year");
        int year = input.nextInt();

        int days = 0;

        if (month < 0 || month > 12) {
            System.out.println("Not a valid month");

        } else {

            switch (month) {
            case 1:
                days = 31;
                System.out.println("January " + year + " had " + days + " days");
                break;

            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }

                System.out.println("February " + year + " had " + days + " days");
                break;

            case 3:
                days = 31;
                System.out.println("March " + year + " had " + days + " days");
                break;
            case 4:
                days = 30;
                System.out.println("April " + year + " had " + days + " days");
                break;

            case 5:
                days = 31;
                System.out.println("May " + year + " had " + days + " days");
                break;

            case 6:
                days = 30;
                System.out.println("June " + year + " had " + days + " days");
                break;

            case 7:
                days = 31;
                System.out.println("July " + year + " had " + days + " days");
                break;

            case 8:
                days = 31;
                System.out.println("August " + year + " had " + days + " days");
                break;

            case 9:
                days = 30;
                System.out.println("September " + year + " had " + days + " days");
                break;

            case 10:
                days = 31;
                System.out.println("October " + year + " had " + days + " days");
                break;

            case 11:
                days = 30;
                System.out.println("November " + year + " had " + days + " days");
                break;

            case 12:
                days = 31;
                System.out.println("December " + year + " had " + days + " days");
                break;

            }
        }

    }
}
