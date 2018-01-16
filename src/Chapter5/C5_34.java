package Chapter5;

import java.util.Scanner;

/**
 * Program to play a game of rock paper scissors with user
 *
 * @author Tristan Brandeberry
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// declares integers for the computer guess and the player's guess and their points so they can add up       
        int computerGuess, playerGuess;
        int compCount = 0, playerCount = 0;

//asks user to input their guess, then asks for the computer to guess, and then adds a point to whoever wins            
        do {
            System.out.print("Enter Scissor (0), rock (1), or paper (2): ");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);

            if (playerGuess == 0 && computerGuess == 0) {
                System.out.println("It's a tie ");
            }
            if (playerGuess == 0 && computerGuess == 1) {
                System.out.println("You win ");
                playerCount++;
            }
            if (playerGuess == 0 && computerGuess == 2) {
                System.out.println("You lose ");
                compCount++;
            }
            if (playerGuess == 1 && computerGuess == 0) {
                System.out.println(" You win ");
                playerCount++;
            }
            if (playerGuess == 1 && computerGuess == 1) {
                System.out.println("It's a tie ");
            }

            if (playerGuess == 1 && computerGuess == 2) {
                System.out.println("You lose");
                compCount++;
            }
            if (playerGuess == 2 && computerGuess == 0) {
                System.out.println("You lose");
                playerCount++;
            }
            if (playerGuess == 2 && computerGuess == 1) {
                System.out.println("You win");
                playerCount++;
            }
            if (playerGuess == 2 && computerGuess == 2) {
                System.out.println("It's a tie ");
            }
//does this until someone has won more than 2 times        
        } while (compCount <= 2 && playerCount <= 2);

    }
}
