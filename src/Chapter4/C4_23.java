package Chapter4;

import java.util.Scanner;

/**
 * Program to read information about employees and create a payroll statement
 *
 * @author Tristan Brandeberry
 */

public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asks user to enter an eployee's mame and inserts it into a double
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        //asks user to enter # of hours worked and inserts it into a double
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        //asks user to enter Hourly pay rate and inserts it into a double
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        //asks user to enter federal tax withholding rate and inserts it into a double
        System.out.print("Enter federal tax withholding rate: ");
        double federaltax = input.nextDouble();
        //asks user to enter state tax withholing rate and inserts it into a double
        System.out.print("Enter state tax withholding rate: ");
        double statetax = input.nextDouble();

        //Calculates and displays doubles according to their names and then displays them
        System.out.printf("\nEmployee Name: %s", name);

        System.out.printf("\nHours Worked: %.2f", hours);

        System.out.printf("\nPayRate: $%.2f", rate);

        System.out.printf("\nGross Pay: $%.2f", (rate * hours));

        System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (federaltax * 100), (federaltax * rate * hours), (statetax * 100), (statetax * rate * hours), ((federaltax * rate * hours) - (statetax * rate * hours)));

        System.out.printf("\nNet Pay: $%.2f", ((rate * hours) - (federaltax * rate * hours) - (statetax * rate * hours)));

    }
}
