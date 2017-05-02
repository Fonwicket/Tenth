package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer
 * 0 or 1, which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 */
public class Exercise_03_14 {
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Create random result
        int result = (int)(Math.random() * 2);

        // Get user input
        System.out.println("Enter your guess. 1 or 0 ");
        int choice = input.nextInt();

        // Display result
        System.out.println(((result == choice) ? "correct" : "incorrect") + " guess.");
    }

}
