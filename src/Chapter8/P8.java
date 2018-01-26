package Chapter8;

import java.util.Scanner;

/**
 * Program to create an array of data about salesmen, such as the day and the
 * amount of the sale, with data entered by user
 *
 * @author Tristan Brandeberry
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String salesman = ("");
        String day = ("");
        String more = ("");
        do {
            System.out.print("Enter the salesman ID as A, B, C, or D: ");
            salesman = input.next();

            System.out.print("Enter the day as Su, M, T, W, H, F, or Sa: ");
            day = input.next();

            System.out.print("Enter the amount of the sale: ");
            double saleAmount = input.nextDouble();

            do {
                System.out.print("More data? Enter Y for more or N to stop: ");
                more = input.next();
            } while (!more.equalsIgnoreCase("N") && !more.equalsIgnoreCase("Y"));
        } while (more.equalsIgnoreCase("Y"));

        int[][] calendar = new int[5][4];
        {

            for (int r = 0; r < calendar.length; r++) {
                System.out.print("Employee " + r);
                for (int c = 0; c < calendar[r].length; c++) {
                    System.out.print("\t" + calendar[r][c]);
                    calendar[r][c] = input.nextInt();

                    int total = 0;
                    for (int s = 0; s < calendar.length; s++) {
                        for (int a = 0; a < calendar[s].length; a++) {
                            total += calendar[s][a];
                        }
                    }
                }
                System.out.println();

            }
        }
    }
}
