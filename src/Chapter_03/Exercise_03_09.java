package Chapter_03;
import java.util.Scanner;

/**
 * An ISBN-10 (International Standard Book Number) consists  of  10  digits:
 * d1d2d3d4d5d6d7d8d9d10.  The  last  digit, d10,  is  a  checksum,
 * which is calculated from the other nine digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If  the  checksum  is 10,  the  last  digit  is  denoted  as  X  according  to  the  ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer.
 */
public class Exercise_03_09 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve partial ISBN
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int partialISBN = input.nextInt();
        int ISBN = partialISBN;

        // Calculate checksum digit
        int d1 = partialISBN / 100000000;
        partialISBN %= 100000000;

        int d2 = partialISBN / 10000000;
        partialISBN %= 10000000;

        int d3 = partialISBN / 1000000;
        partialISBN %= 1000000;

        int d4 = partialISBN / 100000;
        partialISBN %= 100000;

        int d5 = partialISBN / 10000;
        partialISBN %= 10000;

        int d6 = partialISBN / 1000;
        partialISBN %= 1000;

        int d7 = partialISBN / 100;
        partialISBN %= 100;

        int d8 = partialISBN / 10;
        partialISBN %= 10;

        int d9 = partialISBN;

        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // Display result
        System.out.println("The ISBN-10 number is " + (d1 == 0 ? "0" : "") + ISBN + (d10 == 10 ? "X": d10));
    }
}
