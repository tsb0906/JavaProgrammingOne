package Chapter4;

import java.util.Scanner;

/**
 * Program to display major and status based off of characters entered by user
 *
 * @author Tristan Brandeberry
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// asks user to enter letters for Major and status
        System.out.print(" Enter two characters (letter for Major, number for Status): ");
        //declares char b and char c
        String a = input.next().toUpperCase();
        char b = a.charAt(0);
        char c = a.charAt(1);

        if ((b != 'M' && b != 'C' && b != 'I') || (c != '1' && c != '2' && c != '3' && c != '4')) {
            System.out.println("Invalid");
            System.exit(0);
        }

        // detects if the letter that the user entered is one of the three majors
        if (b == 'M') {
            System.out.print(" Mathehmatics ");
        } else if (b == 'C') {
            System.out.print(" Computer Science ");
        } else if (b == 'I') {
            System.out.print(" Information Technology ");
        }

// detects if the number the user entered is one of the four grades (status)
        if (c == '1') {
            System.out.print(" Freshman ");
        } else if (c == '2') {
            System.out.print(" Sophomore ");
        } else if (c == '3') {
            System.out.print(" Junior ");
        } else if (c == '4') {
            System.out.print(" Senior ");
        }

    }

}
