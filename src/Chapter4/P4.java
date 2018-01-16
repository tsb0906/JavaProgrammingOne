package Chapter4;

import java.util.Scanner;

/**
 * Program to prompt user to input information on two bidders, then finds out
 * which one is better by determining if their hourly rates are the same or
 * different
 *
 * @author Tristan Brandeberry
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asks user to enter a name for the first bidder 
        System.out.print(" Enter name of first bidder: ");
        String bidder1 = input.next();

        //Aks user to input how many hours the first bidder requires
        System.out.print(" How many hours does " + bidder1 + " require: ");
        int bidder1hours = input.nextInt();

        //Asks user to input how much the first bidder charges per hour 
        System.out.print("How much does " + bidder1 + " charge per hour: $");
        double bidder1charge = input.nextDouble();

        //Asks user to enter a name for the second bidder  
        System.out.print(" Enter name of second bidder: ");
        String bidder2 = input.next();

        //Asks user to input how many hours the second bidder requires
        System.out.print(" How many hours does " + bidder2 + " require: ");
        int bidder2hours = input.nextInt();

        //Asks user to input how much the second bidder charges per hour
        System.out.print("How much does " + bidder2 + " charge per hour: $");
        double bidder2charge = input.nextDouble();

        //declares hourly rate for bidder 1 and bidder 2
        double hourlyrate1 = bidder1hours * bidder1charge;
        double hourlyrate2 = bidder2hours * bidder2charge;

        //determines if bidder 1 or bidder 2 wins based on who's hourly rate is less than the other 
        if (hourlyrate1 < hourlyrate2) {
            System.out.printf(" Winner is %s with a price of %.2f", bidder1, hourlyrate1);
        }

        if (hourlyrate1 > hourlyrate2) {
            System.out.printf(" Winner is %s with a price of %.2f", bidder2, hourlyrate2);
        }

        //determines if both bidder 1 and bidder 2 have equal hourly rates and who has more or less hours
        if (hourlyrate1 == hourlyrate2 && bidder1hours < bidder2hours) {
            System.out.printf("Winner is %s with a price of %.2f", bidder1, hourlyrate1);
        }

        if (hourlyrate1 == hourlyrate2 && bidder1hours > bidder2hours) {
            System.out.printf("Winner is %s with a price of %.2f", bidder2, hourlyrate2);
        }

        //determines if both hourly rates and hours are equal 
        if (hourlyrate1 == hourlyrate2 && bidder1hours == bidder2hours) {
            System.out.println("Both " + bidder1 + " and " + bidder2 + " have identical bids ");
        }
        System.out.println(" ");
        System.out.printf("First bidder = %d ", bidder1hours);
        System.out.printf("Second bidder = %d ", bidder2hours);
        System.out.println(" ");
        System.out.printf("First bidder = %.2f ", bidder1charge);
        System.out.printf("Second bidder = %.2f ", bidder2charge);
        System.out.println(" ");
        System.out.printf("First bidder = %.2f ", hourlyrate1);
        System.out.printf("Second bidder = %.2f ", hourlyrate2);

    }
}
