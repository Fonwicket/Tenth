package Chapter_03;
import java.util.Scanner;

/**
 * Listing 3.5, ComputeTax.java, gives the source code to compute taxes for single filers.
 * Complete Listing 3.5 to compute the taxes for all filing statuses.
 */
public class Exercise_03_13 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Creating finals for overview
        final double TAXRANGE1 = 0.10;
        final double TAXRANGE2 = 0.15;
        final double TAXRANGE3 = 0.25;
        final double TAXRANGE4 = 0.28;
        final double TAXRANGE5 = 0.33;
        final double TAXRANGE6 = 0.35;


        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or "
                + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");
        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = 0;
        int t1, t2, t3, t4, t5;
        if (status == 0) {
            // set thresholds income
            t1 = 8350;
            t2 = 33950;
            t3 = 82250;
            t4 = 171550;
            t5 = 372950;

            // Compute tax for single filers
            if (income <= t1)
                tax = income * TAXRANGE1;
            else if (income <= t2)
                tax = t1 * TAXRANGE1 + (income - t1) * TAXRANGE2;
            else if (income <= t3)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (income - t2) * TAXRANGE3;
            else if (income <= t4)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (income - t3) * TAXRANGE4;
            else if (income <= t5)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (income - t4) * TAXRANGE5;
            else
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (t5 - t4) * TAXRANGE5 + (income - t5) * TAXRANGE6;

        } else if (status == 1) {
            // set thresholds income
            t1 = 16700;
            t2 = 67900;
            t3 = 137050;
            t4 = 208850;
            t5 = 372950;

            // Compute tax for married file jointly or qualifying widow(er)
            if (income <= t1)
                tax = income * TAXRANGE1;
            else if (income <= t2)
                tax = t1 * TAXRANGE1 + (income - t1) * TAXRANGE2;
            else if (income <= t3)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (income - t2) * TAXRANGE3;
            else if (income <= t4)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (income - t3) * TAXRANGE4;
            else if (income <= t5)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (income - t4) * TAXRANGE5;
            else
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (t5 - t4) * TAXRANGE5 + (income - t5) * TAXRANGE6;

        } else if (status == 2) {
            // set thresholds income
            t1 = 8350;
            t2 = 33950;
            t3 = 68525;
            t4 = 104425;
            t5 = 186475;

            // Compute tax for married separately
            if (income <= t1)
                tax = income * TAXRANGE1;
            else if (income <= t2)
                tax = t1 * TAXRANGE1 + (income - t1) * TAXRANGE2;
            else if (income <= t3)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (income - t2) * TAXRANGE3;
            else if (income <= t4)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (income - t3) * TAXRANGE4;
            else if (income <= t5)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (income - t4) * TAXRANGE5;
            else
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (t5 - t4) * TAXRANGE5 + (income - t5) * TAXRANGE6;

        } else if (status == 3) {
            // set thresholds income
            t1 = 11950;
            t2 = 45500;
            t3 = 117450;
            t4 = 190200;
            t5 = 372950;

            // Compute tax for head of household
            if (income <= t1)
                tax = income * TAXRANGE1;
            else if (income <= t2)
                tax = t1 * TAXRANGE1 + (income - t1) * TAXRANGE2;
            else if (income <= t3)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (income - t2) * TAXRANGE3;
            else if (income <= t4)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (income - t3) * TAXRANGE4;
            else if (income <= t5)
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (income - t4) * TAXRANGE5;
            else
                tax = t1 * TAXRANGE1 + (t2 - t1) * TAXRANGE2 + (t3 - t2) * TAXRANGE3 + (t4 - t3) * TAXRANGE4 + (t5 - t4) * TAXRANGE5 + (income - t5) * TAXRANGE6;

        } else {
            System.out.println("Error: invalid status");
            System.exit(1);

        }
        // Display the result
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
