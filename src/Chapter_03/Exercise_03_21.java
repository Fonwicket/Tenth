package Chapter_03;
import java.util.Scanner;

/**
 * Zeller’s  congruence  is  an  algorithm  developed  by Christian Zeller to calculate the day of the week.
 * The formula is
 * h= (q + ((26 * m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7
 * <p>
 * where:
 * h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
 * q is the day of the month.
 * m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
 * j is the century (i.e., year / 100 ).
 * k is the year of the century (i.e., year % 100).
 * Note that the division in the formula performs an integer division. Write a program
 * that  prompts  the  user  to  enter  a  year,  month,  and  day  of  the  month,  and
 * displays the name of the day of the week.
 *
 * (Hint: January and February are counted as 13 and 14 in the formula, so you need
 * to convert the user input 1 to 13 and 2 to 14 for the month and change the year to
 * the previous year.)
 *
 */
public class Exercise_03_21 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve a date
        System.out.println("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.println("Enter month: 1-12: ");
        int m = input.nextInt();
        if (m == 1){
            m = 13;
            year -= 1;
        } else if (m == 2){
            m = 14;
            year -= 1;
        }

        System.out.println("Enter the day of the month: ");
        int q = input.nextInt();

        // Compute the day of the week
        int k = year % 100;
        int j = year / 100;

        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

        // Display results
        System.out.print("Day of the week is ");
        switch (h) {
        case 0:
            System.out.println("Saturday");
            break;
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
        }
    }

}
