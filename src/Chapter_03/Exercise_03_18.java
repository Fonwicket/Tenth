package Chapter_03;
import java.util.Scanner;

/**
 * A shipping company uses the following function to calculate the cost (in dollars) of shipping based
 * on the weight of the package (in pounds).
 * Write  a  program  that  prompts  the  user  to  enter  the  weight  of  the  package  and
 * display the shipping cost. If the weight is greater than 50, display a message “the
 * package cannot be shipped.”
 */
public class Exercise_03_18 {
    public static void main(String[] args) {

        // Create a new Scanner
        Scanner input = new Scanner(System.in);

        // Retrieve weight of package
        int weight = input.nextInt();

        // Calculate cost

        double cost = 0.0;

        int w1 = 1;
        int w2 = 3;
        int w3 = 10;
        int w4 = 20;


        // Compute tax for single filers
        if (weight <= w1)
            cost = 3.5;
        else if (weight <= w2)
            cost = t1 * TAXRANGE1 + (income - t1) * TAXRANGE2;
        else if (income <= t3)
            tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (income - t2) * TAXRANGE3;
        else if (income <= t4)
            tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (income - t3) * TAXRANGE4;
        else if (income <= t5)
            tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4
                    + (income - t4) * TAXRANGE5;
        else
            tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4
                    + (t5 - t4) * TAXRANGE5 + (income - t5) * TAXRANGE6;

    }
}
