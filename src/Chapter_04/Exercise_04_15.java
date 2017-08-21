package Chapter_04;
import java.util.Scanner;

/**
 * The international standard letter/number mapping found on the
 * telephone is shown below:
 * Write a program that prompts the user to enter a letter and displays its corresponding
 * number.
 */
public class Exercise_04_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Retrieve input
        System.out.println("Enter a letter: ");
        String character = input.nextLine().toUpperCase();
        if (character.length() != 1) {
            System.out.println("Enter 1 character");
            System.exit(1);
        }

        char ch = character.charAt(0);
        if (Character.isLetter(ch)) {

            int number = 1;
            String two = "ABC";
            String three = "DEF";
            String four = "GHI";
            String five = "JKL";
            String six = "MNO";
            String seven = "PQRS";
            String eight = "TUV";
            String nine = "XYZ";



            if (two.contains(character)) {
                number = 2;
            } else if (three.contains(character)) {
                number = 3;
            } else if (four.contains(character)) {
                number = 4;
            } else if (five.contains(character)) {
                number = 5;
            } else if (six.contains(character)) {
                number = 6;
            } else if (seven.contains(character)) {
                number = 7;
            } else if (eight.contains(character)) {
                number = 8;
            } else if (nine.contains(character)) {
                number = 9;
            }

            System.out.println("The corresponding number is " + number);
        } else{
            System.out.println(character + " is not a valid input");
        }

    }
}


