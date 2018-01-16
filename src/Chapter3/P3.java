package Chapter3;

import java.util.Scanner;

/**
 * Program to assign letter grade based off of numbers entered
 *
 * @author Tristan Brandeberry
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //creates scanner
        Scanner input = new Scanner(System.in);
        //asks user for imput for firstnumber and secondnumber
        System.out.println("Enter the first number:");
        double firstnumber = input.nextDouble();

        System.out.println("Enter the second number:");
        double secondnumber = input.nextDouble();
        //detects if user imputs are equal
        if (firstnumber == secondnumber) {
            System.out.println(" First number is equal to the second ");
        }
        //detects if 1st user input is less than the second
        if (firstnumber < secondnumber) {
            System.out.println(" First number is less than the second ");
        }
        //detects if 1st number is greater than the second
        if (firstnumber > secondnumber) {
            System.out.println(" First number is greater than the second ");
        }
        //detects if 1st user input is less or equal to the second
        if (firstnumber <= secondnumber) {
            System.out.println(" First number is less or equal to the second ");
        }
        //detetcts if 1st user input does not equal the second
        if (firstnumber != secondnumber) {
            System.out.println(" First number does not equal the second");
        }
        //detects if 2nd user input equals zero, then determines if input is a proper/improper fraction
        if (secondnumber == 0) {
            System.out.println(" Cannot divide by zero ");
        } //
        else if (firstnumber / secondnumber < 1) {
            System.out.println(" Proper fraction ");
        } else {
            System.out.println(" Improper fraction ");
        }
        //determines what letter grade the 1st user input is
        if (firstnumber >= 90) {
            System.out.println("A");
        } else if (firstnumber >= 80) {
            System.out.println("B");
        } else if (firstnumber >= 70) {
            System.out.println("C");
        } else if (firstnumber >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        //detects if 2nd user input is in range of 1-100
        if (secondnumber <= 100 && secondnumber >= 1) {
            System.out.println(" In range ");
        } else {
            System.out.println(" Out of range ");
        }
    }
}
