package Chapter4;

import java.util.Scanner;

/**
 * Program to prompt user to enter two strings and report whether the second
 * string is a substring of the first string
 *
 * @author Tristan Brandeberry
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks user to input string s1 and then s2
        System.out.print(" Enter string s1: ");
        String s1 = input.next();
        System.out.print(" Enter string s2: ");
        String s2 = input.next();

        //determines if s1 contains anything from s2
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

}
