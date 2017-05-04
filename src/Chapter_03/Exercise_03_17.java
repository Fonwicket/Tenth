package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that plays the popular scissor-rock- paper game.
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number
 * 0, 1, or 2 representing scissor, rock, and paper.
 * The program prompts the user to enter a number 0, 1, or 2
 * and displays a message indicating whether the user or the computer wins, loses, or draws.
 */
public class Exercise_03_17 {
    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve user input
        System.out.println("scissor (0), rock (1), paper (2): ");
        int choice = input.nextInt();

        // Create random number
        int random = (int) ((Math.random() * 3));

        // Display result
        System.out.print("The computer is ");
        switch (random) {
        case 0:
            System.out.print("scissor. ");
            break;
        case 1:
            System.out.print("rock. ");
            break;
        case 2:
            System.out.print("paper. ");
            break;
        }

        System.out.print("You are ");
        switch (choice) {
        case 0:
            System.out.print("scissor. ");
            break;
        case 1:
            System.out.print("rock. ");
            break;
        case 2:
            System.out.print("paper. ");
            break;
        }

        if (choice == random) {
            System.out.print("It is a draw.");
        } else {
            boolean win = (choice == 0 && random == 2) || (choice == 1 && random == 0) || (choice == 2 && random == 1);

            if (win) {
                System.out.print("You won.");
            } else {
                System.out.print("You lose.");
            }

        }

    }
}
