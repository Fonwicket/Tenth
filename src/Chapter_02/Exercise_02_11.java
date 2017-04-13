package Chapter_02;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LocatorEx;

import java.util.Scanner;

/**
 * Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. The population
 * should be cast into an integer
 *         /** 1.11 The U.S. Census Bureau projects population based on the following assumptions:
 *        ■ One birth every 7 seconds
 *        ■ One death every 13 seconds
 *        ■ One new immigrant every 45 seconds
 *    Write a program to display the population for each of the next five years. Assume the
 *    current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 *    integers perform division, the result is an integer. The fractional part is truncated. For
 *    example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 *    the fractional part, one of the values involved in the division must be a number with a
 *    decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Exercise_02_11 {
    public static void main(String[] args)
    {


        // Create a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the number of years
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        // Compute the population
        int population = (int) (312032486 + (((31536000 / 7.0) - (31536000 / 13.0) + (31536000 / 45.0)) * years));
        System.out.println("The population in " + years + " years is " + population);


    }
}
