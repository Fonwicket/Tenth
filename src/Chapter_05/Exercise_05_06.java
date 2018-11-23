package Chapter_05;
/*
Write a program that displays the following
two tables side by side:

Miles Kilometers    |   Kilometers      Miles
1       1.609       |   20              12.430
2       3.218       |   25              15.538
...
9       14.481      |   60              37.290
10      16.090      |   65              40.398
 */

public class Exercise_05_06 {

    public static void main(String[] args) {

        final Double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles       Kilometers  |   Kilometers      Miles");


        for (int i = 1, j = 20; i < 11 && j < 66; i ++, j+=5){

            System.out.printf("%-15d%4.3f", i, (i * MILES_TO_KILOMETERS));
            System.out.printf("     |   ");
            System.out.printf("%-15d%4.3f\n", j, (j / MILES_TO_KILOMETERS));


        }

    }
}
