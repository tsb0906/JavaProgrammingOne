package Chapter7;

import java.util.Scanner;

/**
 * Program to find out if arrays are identical
 *
 * @author Tristan Brandeberry
 */

public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//asks user to enter 2 lists and stores them as ints
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        //determines if the 2 lists are identical or not by calling on equals
        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }
    }

    /**
     * secondary Method
     *
     * @param list1 list entered by user
     * @param list2 list entered by user
     * @return true if list 1 is equal to list 2
     */
    public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list2.length; i++) {
            return false;
        }
        return true;
    }

}
