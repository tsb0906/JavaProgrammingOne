package Chapter7;

import java.util.Scanner;

/**
 * Program to read array entered by user and display the average, then the
 * contents in brackets
 *
 * @author Tristan Brandeberry
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read: ");
        int numbers = input.nextInt();

        System.out.print("Enter " + numbers + " elements: ");

        int[] elements = new int[input.nextInt()];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = input.nextInt();

        }
        average(elements);
        arrayinBrackets(elements);
    }

    /**
     * Secondary Method
     *
     * @param data from command line prompt
     */
    public static void average(int[] data) {
        int sum = 0;

        for (int d : data) {
            sum += d;
        }
        double average = sum / data.length;

        System.out.println("The average is " + average);

    }

    /**
     * Third Method
     *
     * @param elements from command line prompt
     */
    public static void arrayinBrackets(int[] elements) {

        System.out.println("The contents of the array: " + java.util.Arrays.toString(elements));

    }
}
