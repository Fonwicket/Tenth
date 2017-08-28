package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two strings and
 * reports whether the second string is a substring of the first string.
 */
public class Exercise_04_22 {
    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string s1: ");
        String s1 = input.next();

        System.out.println("Enter string s2: ");
        String s2 = input.next();

        // is s2 a substring of s1
        Boolean isSubString = (s1.contains(s2));



        // Result
        System.out.println(s2 + (isSubString?" is a ": " is not a ") + "substring of " + s1);








    }

}


