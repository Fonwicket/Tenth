package Chapter_03;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter
 * an integer and determines
 * whether it is divisible by 5 and 6,
 * whether it is divisible by 5 or 6,
 * and whether it is divisible by 5 or 6, but not both.
 */
public class Exercise_03_26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get input
        System.out.println("Enter an Integer: ");
        int div = input.nextInt();

        //Calculate results
        Boolean fiveAndSix = (div % 5 == 0 && div % 6 == 0 );
        Boolean fiveOrSix = (div % 5 == 0 || div % 6 == 0 );
        Boolean both = (div % 5 == 0 ^ div % 6 == 0 );

        System.out.println("By 5: " + div % 5);
        System.out.println("By 6: " + div % 6);

        // result
        System.out.println("Is " + div + " divisible by 5 and 6? " + fiveAndSix );
        System.out.println("Is "+ div + " divisible by 5 or 6? " + fiveOrSix);
        System.out.println("is " + div + " divisible by 5 or 6, but not both? " + both);

        //System.out.println("Point (" + x + ", " + y + ") is " + ((withinRectangle) ? "in " : "not in ") + "the rectangle");



    }
}
