package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order. (increasing order...)
 */
public class Exercise_03_08 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve 3 integers
        System.out.println("Enter 3 numbers (no decimal): ");
        int value1 = input.nextInt();
        int value2 = input.nextInt();
        int value3 = input.nextInt();

        // Set the values in increasing order

        if(value1 > value2){
            int temp1 = value2;
            value2 = value1;
            value1 = temp1;
        }

        if (value2 > value3){
            int temp2 = value3;
            value3 = value2;
            value2 = temp2;
            if(value1 > value2){
                int temp1 = value2;
                value2 = value1;
                value1 = temp1;
            }
        }

        // Display result

        System.out.println("number are: " + value1 + " " + value2 + " " + value3);
    }
}
