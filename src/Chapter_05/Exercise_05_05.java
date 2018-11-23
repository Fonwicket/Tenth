package Chapter_05;

/*
 Write a program
that displays the following two tables side by side:
Kilograms    Pounds | Pounds     Kilograms
1 2.2               | 20        9.09
3 6.6               | 25        11.36
...
197 433.4           | 510       231.82
199 437.8           | 515       234.09
 */

public class Exercise_05_05 {
    public static void main(String[] args) {

        final Double POUNDS_TO_KILOGRAMS = 2.2;



        System.out.println("Kilograms       Pounds  |   Pounds      Kilograms");


        for (int i = 1, j = 20; i < 200 && j < 516; i +=2, j+=5){

            System.out.printf("%-15d%4.1f", i, (i * POUNDS_TO_KILOGRAMS));
            System.out.printf("     |   ");
            System.out.printf("%-15d%4.2f\n", j, (j / POUNDS_TO_KILOGRAMS));


        }

    }
}
