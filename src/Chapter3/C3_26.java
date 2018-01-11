package Chapter3;

import java.util.Scanner;

/**
 * Program to determine whether user input is divisible by 5 or/and/but not both
 * 6
 *
 * @author Tristan Brandeberry
 */

public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks user to enter an integer
        System.out.print(" Enter an integer:");
        int number = input.nextInt();
        //determines if user input is divisible by 5 and 6
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by 5 and 6.");
        } else {
            System.out.println(number + " is not divisible by 5 and 6.");
        }
        //determines if user input is divisible by 5 or 6

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6.");
        } else {
            System.out.println(number + " is not divisible by 5 or 6.");
        }
//determines if user input is divisible by 5 or 6 but not both

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6, but not both.");
        } else {
            System.out.println(number + " is not divisible by 5 and 6, but not both.");
        }
    }
}
