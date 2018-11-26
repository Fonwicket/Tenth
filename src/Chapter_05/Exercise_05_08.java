package Chapter_05;

/*
Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score
 */

import java.util.Scanner;

public class Exercise_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestScore = 0;
        String highestScoreName = "";

        int numberOfStudents = 0;
        System.out.println("Enter number of students");
        numberOfStudents = input.nextInt();

        for (int i=0; i < numberOfStudents;i++){
            System.out.println("enter student and score");
            String name = input.next();

            int score = input.nextInt();
            if (score > highestScore){
                highestScore = score;
                highestScoreName = name;
            }
        }

        System.out.printf("The highest score is %s and belongs to %s", highestScore, highestScoreName);





    }






}
