package Chapter_03;
import java.util.Scanner;

/**
 * Programming Exercise 2.17 gives a formula
 * to compute the wind-chill temperature. The formula is valid for temperatures in
 * the  range  between  −58ºF  and  41ºF  and  wind  speed  greater  than  or  equal  to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it  displays  a  message  indicating  whether  the  temperature  and/or  wind  speed  is
 * invalid.
 */
public class Exercise_03_20 {
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);

        // Retrieve the temperature and wind speed
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2 in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Compute the wind-chill temperature
        double windChill =
                35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math
                        .pow(windSpeed, 0.16));

        // Display the results


        if (temperature <= -58 || temperature >= 41 || windSpeed < 2)
        {
            System.out.print("The ");
            if (temperature <= -58 || temperature >= 41)
                System.out.print("temperature ");
            if ((temperature <= -58 || temperature >= 41) && windSpeed < 2)
                System.out.print("and ");
            if (windSpeed < 2)
                System.out.print("wind speed ");
            System.out.println("is invalid");
            System.exit(1);
        }

            System.out.println("The wind chill index is " + windChill);
    }

}
