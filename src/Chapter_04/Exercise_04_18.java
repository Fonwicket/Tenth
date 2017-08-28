package Chapter_04;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following chracters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 */
public class Exercise_04_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two characters: ");
        String c = input.next();

        String major = c.substring(0, 1).toUpperCase();
        String majorchoice = "MCI";
        String student = "";
        int s = Integer.parseInt(c.substring(1));

        if (major.contains(majorchoice) && (s > 0 && s < 5)) {

            switch (major) {
            case "M":
                major = "Mathematics";
                break;

            case "C":
                major = "Computer Science";
                break;

            case "I":
                major = "Information Technology";

            }

            switch (s) {
            case 1:
                student = "Freshman";
                break;

            case 2:
                student = "sophomore";
                break;

            case 3:
                student = "junior";
                break;

            case 4:
                student = "senior";

            }

            System.out.println(major + " " + student);

        } else {
            System.out.println("Invalid input");
        }

    }

}


