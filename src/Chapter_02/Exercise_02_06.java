package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that reads an integer between 0 and 1000
 * and adds all the digits in the integer. For example, if an integer is 932
 * the sum of all digits is 14 (9+3+2).
 * Hint: use the % operator to extract the digits and use the /
 * to remove the extracted digit.
 */
public class Exercise_02_06 {

    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve an integer
        System.out.println("Enter a number in between 0 and 1000: ");
        int number = input.nextInt();

        // Retreive the digits
        int firstdigit = number % 10;
        int remainingtwodigit = number / 10;
        int seconddigit = remainingtwodigit % 10;
        int thirthdigit = remainingtwodigit / 10;

        // Display the result
        System.out.println("The sum of the digits is " + (firstdigit + seconddigit + thirthdigit));
    }
}
