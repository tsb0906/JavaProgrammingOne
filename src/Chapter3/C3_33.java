package Chapter3;

import java.util.Scanner;

/**
 * Program to compare costs and display one with better price
 *
 * @author Tristan Brandeberry
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asks user to enter weight and price for packages 1 and 2
        System.out.print(" Enter weight and price for package 1:");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2:");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        //determines which package has a better price
        if ((price1 / weight1) < (price2 / weight2)) {
            System.out.println(" Package 1 has a better price. ");
        } else if ((price1 / weight1) > (price2 / weight2)) {
            System.out.println("Package 2 has a better price. ");
        } //determines if both packages have same price
        else {
            System.out.println("Packages 1 and 2 have same price. ");
        }

    }
}
