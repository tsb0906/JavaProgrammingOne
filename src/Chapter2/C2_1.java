package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celsius to Fahrenheit and display the result to the
 * console
 *
 * @author Tristan Brandeberry
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius:");
        double celcius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celcius + 32;

        System.out.println(celcius + " celcius is " + fahrenheit + " fahrenheit ");
    }
}
