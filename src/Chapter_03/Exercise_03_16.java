package Chapter_03;
/**
 * Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 */
public class Exercise_03_16 {
    public static void main(String[] args) {
        // Create x-point
        int xPoint = (int) ((Math.random() * (50 + 50)) - 50);
        int yPoint = (int) ((Math.random() * (100+100)) - 100);

        // Display result
        System.out.println("A point in the triangle is: (" + xPoint + "," + yPoint + ")");
    }
}
