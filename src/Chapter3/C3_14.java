package Chapter3;

import java.util.Scanner;

/**
 * Program to let user guess whether flip of a coin is heads or tails
 *
 * @author Tristan Brandeberry
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks user to input 0 or 1 for heads or tails
        System.out.println(" Heads or Tails? (input 0 for heads and 1 for tails):1");

        //computer chooses either 0 or 1 randmomly 
        int computer = (int) (Math.random() * 2);
        int userguess = input.nextInt();
        //computer says if user is right or wrong on guess for heads or tails and displays if correct or incorrect          
        if (computer == userguess) {
            System.out.println(" correct ");
        } else {
            System.out.println("incorrect");
        }

    }
}
