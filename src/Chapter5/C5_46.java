package Chapter5;

import java.util.Scanner;

/**
 * Program to reverse a string entered by user
 *
 * @author Tristan Brandeberry
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Askes user to enter a string and then reverses that string and displays it
        System.out.print("Enter a string: ");

        String s = input.nextLine();
        System.out.printf("The reverse string is %s ",
                (new StringBuffer(s).reverse().toString()));

    }
}
