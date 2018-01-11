package Chapter6;

import java.util.Scanner;

/**
 * Program to convert currency entered by user
 *
 * @author Tristan Brandeberry
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" How many Euros does a dollar buy? ");
        double e = input.nextDouble();

        System.out.println(" How many Pound Sterling does a dollar buy? ");
        double p = input.nextDouble();

        System.out.println(" How many Yen will a dollar buy? ");
        double y = input.nextDouble();

        String reply = "";
        do {

            System.out.print("Please enter the number of dollars you want to convert: $");
            double dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String currency = input.next().toUpperCase();

            // Chosing a conversion to perform based on the user selection
            switch (currency) {
                case "E":
                    double eurosBought = conversion(dollars, e);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollars, eurosBought);
                    break;
                case "P":
                    double poundSterlingBought = conversion(dollars, p);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings.\n", dollars, poundSterlingBought);
                    break;
                case "Y":
                    double yenBought = conversion(dollars, y);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", dollars, yenBought);
                    break;
            }
            // Asking the user if they want to perform more conversions
            do {
                System.out.print("Are there more conversions to perform? ");
                reply = input.next();
            } while (!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no"));

        } while (reply.equalsIgnoreCase("yes"));

    }

    //write the method to perform the conversion below
    public static double conversion(double dollars, double currency) {
        if (dollars > 100) {
            dollars = dollars - (dollars * 0.10);
        } else {
            dollars = dollars - (dollars * 0.05);
        }

        return dollars * currency;
    }

}
