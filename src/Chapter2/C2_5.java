package Chapter2;

import java.util.Scanner;

/**
 * Program to read the subtotal and gratuity rate, then computes the gratuity
 * and total, then displays result
 *
 * @author Tristan Brandeberry
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double gratuityrate = gratuity / 100 * subtotal;

        System.out.println(subtotal + " subtotal " + gratuityrate + "gratuity rate ");
    }
}
