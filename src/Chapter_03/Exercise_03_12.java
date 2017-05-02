package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a three-digit
 * integer  and  determines  whether  it  is  a  palindrome  number.  A  number
 * is  palindrome if it reads the same from right to left and from left to right.
 */

public class Exercise_03_12 {

    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer: ");
        int number = input.nextInt();

        // Separate the numbers

        int temp = number;
        int number1 = temp / 100;
        temp %= 100;
        temp %= 10;
        int number3 = temp;

        // Check for palindrome
        if (number1 == number3){
            System.out.println(number + " is a palindrome");
        } else
        {
            System.out.println(number + " is not a palindrome");
        }





    }

}
