package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that reads the following information
 * and prints a payroll statement:
 * Employee’s name (e.g., Smith)
 * Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 */
public class Exercise_04_23 {
    public static void main(String[] args) {

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve inputs
        System.out.println("Enter employee's name: ");
        String name = input.next();

        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double payrate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double ftwr = input.nextDouble();

        System.out.println("Enter state tax withholding rate:");
        double stwr = input.nextDouble();

        double grosspay = payrate * hours;
        double totftwr = ftwr * grosspay;
        double totstwr = stwr * grosspay;

        System.out.print("Employee name: " + name);
        System.out.printf("\nHours worked: %2.1f", hours);
        System.out.printf("\nPay rate: $%3.2f", payrate);
        System.out.printf("\nGross pay: $%3.2f", grosspay);
        System.out.printf("\nDeductions:");
        System.out.printf("\n\tFederal Withholding (%2.1f%%): $%3.2f", (ftwr * 100), totftwr);
        System.out.printf("\n\tState Withholding (%2.1f%%): $%3.2f", (stwr * 100), totstwr);
        System.out.printf("\n\tTotal Deduction: $%3.2f", (totftwr + totstwr));
        System.out.printf("\nNet Pay: $%3.2f", (grosspay - (totftwr + totstwr)));

    }

}


