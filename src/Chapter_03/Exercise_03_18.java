package Chapter_03;
import java.util.Scanner;

/**
 * A shipping company uses the following function to calculate the cost (in dollars) of shipping based
 * on the weight of the package (in pounds).
 * Write  a  program  that  prompts  the  user  to  enter  the  weight  of  the  package  and
 * display the shipping cost. If the weight is greater than 50, display a message “the
 * package cannot be shipped.”
 * 3.5, if 0 < w < = 1
 */
public class Exercise_03_18 {
    public static void main(String[] args) {

        // Create a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve weight of package
        System.out.println("Enter weight of package: ");
        double weight = input.nextDouble();

        // Calculate cost
        double cost = 0.0;

        if (weight > 50.0) {
            System.out.println("The package cannot be shipped");
        }

        if (weight <= 1.0) {
            cost = 3.5;
        } else if (weight > 1.0 && weight <= 3.0) {
            cost = 5.5;
        } else if (weight > 3.0 && weight <= 10.0) {
            cost = 8.5;
        } else //(weight > 10.0 && weight <= 20.0) {
            cost = 10.5;


        System.out.println("The cost for shipping is: $" + cost * weight);

    }

}

