package Chapter_04;
import java.util.Scanner;

/**
 * Rewrite the Programming Exercise  3.9 by entering the ISBN number as a string.
 */
public class Exercise_04_19 {
    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve partial ISBN
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String i = input.next();
        int partialISBN = Integer.parseInt(i);
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
        System.out.println("The ISBN-10 number is " + (d1 == 0 ? "0" : "") + ISBN + (d10 == 10 ? "X" : d10));
    }

}


