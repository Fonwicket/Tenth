package Chapter_01;

public class Exercise_01_13 {
    public static void main(String[] args)
    {
        /* 1.13 You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
        ax + by = e
        cx + dy = f
        x = (ed - bf) / (ad - bc)
        y = (af - ec) / (ad - bc)
        Write a program that solves the following equation and displays the value for x and y:
        3.4x + 50.2y = 44.5
        2.1x + .55y = 5.9
        */

        System.out.println("equation:   \n" + " 3.4x + 50.2y = 44.5\n" + " 2.1x + .55y = 5.9");
        System.out.println(
                "x = (e * d - b * f) / (a * d - b * c) = " + ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2
                        * 2.1)));
        System.out.println(
                "y = (a * f - e * c) / (a * d - b * c) = " + ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2
                        * 2.1)));
        System.out.println("Check");
        System.out.println((3.4 * ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1))) + (
                50.2 * ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1))));
        System.out.println((2.1 * ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1))) + (
                0.55 * ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1))));

    }
}
