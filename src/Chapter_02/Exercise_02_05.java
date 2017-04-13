package Chapter_02;

import java.util.Scanner;

/**
 * Write a program that reads the subtotal and the gratuity rate
 * , then computes the gratuity and total. For example, if the user enters
 * 10  for subtotal and 15% for gratuity rate, the program displays $1.5 as
 * gratuity and $11,5 as total
 */
public class Exercise_02_05 {

    public static void main(String[] args) {
        // Make a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the subtotal and gratuity rate
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();

        // Calulate the gratuity
        double gratuity = subtotal * (gratuityrate / 100.0);

        // Calculate the total
        double total = subtotal + gratuity;

        // Display the result
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }

}
