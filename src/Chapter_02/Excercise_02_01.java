package Chapter_02;

/**
 *  Write a program that reads a Celsius degree in a double value from the console,
 *  then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 *
 *  fahrenheit = (9/5) * celius + 32
 *
 */

import java.util.Scanner;

public class Excercise_02_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Celcius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius + " is " + fahrenheit +  " Fahrenheit");







    }
}
