package Chapter7;

import java.util.Scanner;

/**
 * Program to find smallest element in an array
 *
 * @author Tristan Brandeberry
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// asks user to imput 10 numbers
        double[] s = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < s.length; i++) {
            s[i] = input.nextDouble();
        }
// displays minimum number by calling on min
        System.out.println("The minimum nummber is: " + min(s));
    }

    /**
     * Secondary Method
     *
     * @param array arguments from command line prompt
     * @return smallest number in array
     */
    public static double min(double[] array) {

        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }

}
