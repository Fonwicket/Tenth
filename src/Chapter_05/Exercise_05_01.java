package Chapter_05;

/*
  Write a program that reads an unspecified number of integers, determines how many
  positive and negative values have been read, and computes the total and average of
  the input values (not counting zeros). Your program ends with the input 0. Display
  the average as a floating-point number
 */

import java.util.Scanner;

public class Exercise_05_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The logic
        int pos = 0;
        int neg = 0;
        double total = 0;
        int ctr = 0;


        System.out.println("Enter an integer, the input ends if it is 0");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("no numbers are entered except 0");
            System.exit(1);

        }

        while (number != 0){
            if (number > 0){
                pos++;
            } else {
                neg++;
            }
            total+= number;
            ctr++;
            number = input.nextInt();
        }







        System.out.println("the number of positives is " + pos );
        System.out.println("the number of negatives is " + neg );
        System.out.println("the total is " + total );
        System.out.println("the average is " + total / ctr );


    }
}
