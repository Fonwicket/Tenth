package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a string and displays its length and its first character.
 */
public class Exercise_04_20 {
    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a random text");
        String line = input.nextLine();

        // find length and first character
        int l = line.length();
        String s = line.substring(0,1);


        // Display result
        System.out.println("The length of the string is " + l);
        System.out.println("The first character is " + s);
    }

}


