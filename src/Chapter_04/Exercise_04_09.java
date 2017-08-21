package Chapter_04;
import java.util.Scanner;

/**
 *  Write a program that receives an ASCII code
 *  (an integer between 0 and 127) and displays its character
 */
public class Exercise_04_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get ASCII code
        System.out.println("Enter an character: ");
        String character = input.nextLine();

        // Get char
        char ch = character.charAt(0);
        System.out.println("The ASCII code for " + character + " is " + (int) ch);




    }

}
