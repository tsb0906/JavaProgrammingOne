package Chapter8;
/**
 * Program to create 7 by 7 array
 *
 * @author Tristan Brandeberry
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

// creates 7 by 7 array
        int[][] hoursPerWeek = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9},};
        
        // Store the total hours for each row
       
        for(int r = 0; r < hoursPerWeek.length; r++) {
            System.out.print("Employee " + r);
            for(int c = 0; c < hoursPerWeek[r].length; c++) {
                System.out.print("\t" + hoursPerWeek[r][c]);
            }
            System.out.println();
        }


    }

}
