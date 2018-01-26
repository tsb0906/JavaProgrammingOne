package Chapter7;

import java.util.Scanner;

/**
 * Program to read array entered by user and display the average, then the
 * contents in brackets
 *
 * @author Tristan Brandeberry
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //askes user to input number of students
        System.out.print(" Enter how many students there are: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];

        //asks user to enter student scores for number of students entered
        System.out.print(" Enter " + numberOfStudents + " student scores: ");
        scores[0] = input.nextInt();
        scores[1] = input.nextInt();
        scores[2] = input.nextInt();
        scores[3] = input.nextInt();

        displayGrades(scores);

    }

    /**
     * Secondary Method
     *
     * @param grades from command line prompt
     */
    public static void displayGrades(int[] grades) {
        int highestscore = bestGrade(grades);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf(" Student %d score is %d and grade is %s%n",
                    i, grades[i], letterGrade(grades[i], highestscore));
        }
    }

    /**
     * Third Method
     *
     * @param grades arguments from command line prompt
     */
    public static int bestGrade(int[] grades) {
        int highestScore = grades[0];

        for (int grade : grades) {
            if (grade > highestScore) {
                highestScore = grade;
            }

        }

        return highestScore;
    }

    /**
     * Fourth Method
     *
     * @param grade arguments from command line prompt
     * @param highestScore from command line prompt
     */
    public static char letterGrade(int grade, int highestScore) {

        if (highestScore - grade <= 10) {
            return 'A';
        } else if (highestScore - grade > 10 && highestScore - grade <= 20) {
            return 'B';
        } else if (highestScore - grade > 20 && highestScore - grade <= 30) {
            return 'C';
        } else if (highestScore - grade > 30 && highestScore - grade <= 20) {
            return 'D';
        } else {
            return 'F';
        }

    }
}
