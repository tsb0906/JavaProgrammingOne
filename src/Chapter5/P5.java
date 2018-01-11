package Chapter5;

import java.util.Scanner;

/**
 * Program to count votes entered by user for yes and no
 *
 * @author Tristan Brandeberry
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declares the vote string and the yes and no vote counts
        String vote = "";
        int yesCount = 0, noCount = 0;

        //if user enters y for yes votes or n for no votes then the computer adds to the vote and continues until the user inputs q for quit
        do {

            System.out.print("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
            vote = input.next();

            if (vote.equalsIgnoreCase("y")) {
                yesCount++;
            } else if (vote.equalsIgnoreCase("n")) {
                noCount++;
            } //if user enters something other than y or n, then the computer displays "INVALID CODE"
            else if (!vote.equalsIgnoreCase("y") && !vote.equalsIgnoreCase("n") && !vote.equalsIgnoreCase("q")) {
                System.out.println("INVALID CODE:");
            }

            //If user enters q, then computer desplays the number of yes and no votes
        } while (!vote.equalsIgnoreCase("q"));

        System.out.println("Yes votes: " + yesCount + " No votes: " + noCount);

    }
}
