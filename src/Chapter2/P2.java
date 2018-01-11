package Chapter2;

import java.util.Scanner;

/**
 * Program to add up all prices for a meal, create tax and tip based off of meal
 * price, then displays each price with total
 *
 * @author Tristan Brandeberry
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Creates scanner
        Scanner input = new Scanner(System.in);
        //Sets value for meal
        System.out.print(" Please enter meal price: $");
        double meal = input.nextDouble();

        //Sets value for drink
        System.out.print(" Please enter drink price: $");
        double drink = input.nextDouble();

        //Sets value for dessert
        System.out.print(" Please enter dessert price $");
        double dessert = input.nextDouble();

        //adds meal, drink, and dessert, makes value for food
        double food = (meal + drink + dessert);
        System.out.print("Price of food = $" + food);

        //multiplies food by .10 to make value for tax
        double tax = (food * .10);

        //multiples food and tax by .15to make value for tip
        double tip = (food + tax) * .15;

        //adds price of food, tax, and tip to make value for total cost
        double total = (food + tax + tip);

        System.out.print(" tax is $" + tax + " tip is $" + tip + " total cost is $" + total);

    }
}
