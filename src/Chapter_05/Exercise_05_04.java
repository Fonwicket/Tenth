package Chapter_05;

/*
Write a program that displays the following
table (note that 1 mile is 1.609 kilometers):
Miles Kilometers
1 1.609
2 3.218
...
9 14.481
10 16.090
 */

public class Exercise_05_04 {
    public static void main(String[] args) {
        final Double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles       kilometers");

        for (int i = 1; i <= 10; i ++){
            System.out.printf("%-15d%4.3f\n", i, (i * MILES_TO_KILOMETERS));
        }
    }
}
