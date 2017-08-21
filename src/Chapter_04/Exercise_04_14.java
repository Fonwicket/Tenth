package Chapter_04;
import java.util.Scanner;

/**
 *  Write a program that prompts the user to enter a
 *  letter grade A, B, C, D, or F and displays its corresponding numeric
 *  value 4, 3, 2, 1, or 0.
 */
public class Exercise_04_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Retrieve input
        System.out.println("Enter a letter grade: ");
        String character = input.nextLine().toUpperCase();

        char ch = character.charAt(0);

        int grade = -1;


        switch (ch) {
        case 'A':
            grade = 4;
            break;

        case 'B':
            grade = 3;
            break;

        case 'C':
            grade = 2;
            break;

        case 'D':
            grade = 1;
            break;

        case 'F':
            grade = 0;
        }

        if (grade < 0) {
            System.out.println(character + " is an invalid grade");

        } else {
            System.out.println("The numeric value for grade " + character + " is " + grade);
        }
    }
}


