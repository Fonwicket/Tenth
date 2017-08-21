package Chapter_04;
import java.util.Scanner;

/**
 *  Write a program that receives an ASCII code
 *  (an integer between 0 and 127) and displays its character
 */
public class Exercise_04_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get ASCII code
        System.out.println("Enter an ASCII code");
        int ascii = input.nextInt();

        // Get char
        System.out.println("The character for ASCII code " + ascii + " is " + (char) ascii);




    }

}
