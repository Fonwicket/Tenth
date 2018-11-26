package Chapter_05;

/*
 Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
 */

import java.util.Scanner;

public class Exercise_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestScore = 0;
        String highestScoreName = "";
        int secondScore = 0;
        String secondName = "";

        int numberOfStudents = 0;
        System.out.println("Enter number of students");
        numberOfStudents = input.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("enter student and score");
            String name = input.next();
            int score = input.nextInt();

            // first is always high
            if (i==0){
                highestScore = score;
                highestScoreName = name;
            }

            // the second can be either the heigest or the second
            // Shift the highest score and second score
             else if (i == 1 && score > highestScore ) {
                 secondScore = highestScore;
                 highestScore = score;
                 secondName = highestScoreName;
                 highestScoreName = name;
                 // Score is only higher than second. Only replace second
            }else if(i == 1) {
                    secondScore = score;
                    secondName = name;

            // All other entries need to trade places with the highest or the second score
                // Replace the highest en set the previous highest as second
            } else if (i > 1 && score > highestScore && score > secondScore){
                 secondScore = highestScore;
                 secondName = highestScoreName;
                 highestScore = score;
                 highestScoreName = name;
                 // Only the second needs to change
            } else if (i > 1 && score > secondScore) {
                 secondName = name;
                 secondScore = score;
            }

        }
        System.out.printf("The highest score is %s and belongs to %s\n", highestScore, highestScoreName);
        System.out.printf("The second score is %s and belongs to %s", secondScore, secondName);

    }

}
