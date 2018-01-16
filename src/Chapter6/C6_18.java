package Chapter6;

import java.util.Scanner;

/**
 * Program to ask for user to enter password then check if it meets parameters
 *
 * @author Tristan Brandeberry
 */
public class C6_18 {

    public static final int PASSWORD_REQUIRED_LENGTH = 8; // password required length 

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//states requirements for password and asks user to enter one based off of it

        System.out.print(
                "Password must have at least eight characters.\n"
                + "Password consists of only letters and digits.\n"
                + "Password must contain at least two digits \n"
                + "Enter a password meeting the requirements above: ");
        String s = input.nextLine();

//determines and says if password is valid or invalid and 
        if (isValidPassword(s)) {
            System.out.println("VALID Password ");
        } else {
            System.out.println("INVALID PASSWORD ");
        }

    }

    /**
     * Secondary Method
     *
     * @param password arguments from isVailidPassword prompt
     * @return false if password.length is greater than the required length
     */
    public static boolean isValidPassword(String password) {

        if (password.length() < PASSWORD_REQUIRED_LENGTH) {
            return false;
        }

//checks each of the characters and digits entered and determines if they meet the requirements ( must have enough characters, letters, and digits
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (isNumeric(ch)) {
                numCount++;
            } else if (isLetter(ch)) {
                charCount++;
            } else {
                return false;
            }
        }
        return (charCount >= 2 && numCount >= 2);
    }

    /**
     * Third Method
     *
     * @param ch arguments from isLetter prompt
     * @return if the character is less than or equal to A and greater than or
     * equal to Z
     */
    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    /**
     * Fourth Method
     *
     * @param ch arguments from isLetter prompt
     * @return if the character is less than or equal to 0 and greater than or
     * equal to 9
     */
    public static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
