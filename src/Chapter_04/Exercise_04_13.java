package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant.
 */
public class Exercise_04_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Retrieve input
        System.out.println("Enter a letter grade: ");
        String character = input.nextLine();

        char ch = character.charAt(0);
        int i = 0;

        switch (ch) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            i++;

        }

        if (i == 1) {
            System.out.println(character + " is a vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(character + " is a consonant");
        } else {
            System.out.println(character + " is an invalid input");
        }
    }
}


