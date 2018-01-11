package Chapter2;

import java.util.Scanner;

/**
 * Program to read radius and length of cylinder and compute area and volume
 * then displays result to the console
 *
 * @author Tristan Brandeberry
 */

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;

        System.out.println(area + " area is " + volume + " volume is ");
    }
}
