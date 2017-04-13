package Chapter_01;

public class Exercise_01_11
{
    public static void main(String[] args)
    {
        /* 1.11 The U.S. Census Bureau projects population based on the following assumptions:
                ■ One birth every 7 seconds
                ■ One death every 13 seconds
                ■ One new immigrant every 45 seconds
            Write a program to display the population for each of the next five years. Assume the
            current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
            integers perform division, the result is an integer. The fractional part is truncated. For
            example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
            the fractional part, one of the values involved in the division must be a number with a
            decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
        */

        System.out.println("Population year 0: 312032486");
        System.out.println("Population year 1: " + (312032486 + (1.0 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)))));
        System.out.println("Population year 2: " + (312032486 + (2.0 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)))));
        System.out.println("Population year 3: " + (312032486 + (3.0 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)))));
        System.out.println("Population year 4: " + (312032486 + (4.0 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)))));
        System.out.println("Population year 5: " + (312032486 + (5.0 * ((31536000 / 7) - (31536000 / 13) + (31536000 / 45)))));

    }
}
