package Chapter_05;
/*
 Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.
 */
public class Exercise_05_07 {
    public static void main(String[] args) {
        double tuition = 10000; // year 0
        int year = 0;
        double total = 0;

        while (year < 14) {
            tuition = tuition * 1.05;
            year++;
            System.out.printf("Tuition in year %1d will be $ %.2f\n", year, tuition);
            if (year > 10){
                total = tuition + total;
            }

        }

        System.out.printf("The total is $ %.2f", total);


    }
}
