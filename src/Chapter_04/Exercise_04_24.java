package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter three cities and
 * displays them in ascending order.
 */
public class Exercise_04_24 {
    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve inputs
        System.out.println("Enter the first city: ");
        String city1 = input.next();

        System.out.println("Enter the second city: ");
        String city2 = input.next();

        System.out.println("Enter the third city: ");
        String city3 = input.next();

        String temp;

        if (city1.compareTo(city2) < 0){ // zet de laagte waarde van 1 en 2 op plek 1 en de andere op plek 2
            temp = city2;  // temp = b, city1 = b
            city2 = city1; // city 1 = a, city 2 = a
            city1 = temp; // city2 = b , temp=b
            //resultaat BAC wordt ABC
        }

        if (city1.compareTo(city3) < 0){ // zet de laagste waarde van 1 en 3 op 1 en de andere op plek 3
            temp = city3;
            city3 = city1;
            city1 = temp;
        }

        if (city2.compareTo(city3) < 0){ // laatste check of 2 en 3 nog gewisseld moeten worden
            temp = city3;
            city3 = city2;
            city2 = temp;

        }

        System.out.println("The three cities in alphabetical order are " + city1 + ", " + city2 + " and " + city3 );



    }

}


