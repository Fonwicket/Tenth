package Chapter_04;
import java.util.Scanner;

/**
 * RWrite a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number.
 */
public class Exercise_04_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        // Calculate hex number of int
        String hex = Integer.toHexString(value);

        // Display result
        if (value < 16 && value > 0) {
            System.out.println("The hex value is " + hex.toUpperCase());
        } else {
            System.out.println(value + " is an invalid input");
        }



    }
}


