import java.util.Scanner;
/**
 * Print integers 1 to N, one per line.
 * @author Jim
 */
public class Lab04a {
    private static final Scanner console = new Scanner(System.in);

    private static void printIntegers(int limit) {
        for(int k=1; k<=limit; k++) System.out.println(k);
    }

    /** Get user input, then print ints up to value specified. */
    public static void main(String[] args) {
        int upperBound = 0;
        while( upperBound <= 0 ) {
            System.out.print("Please input N: ");
            String input = console.nextLine();
            try {
                upperBound = Integer.parseInt(input);
            } catch(NumberFormatException nfe) {
                System.out.println("Sorry, fumble fingers. Please input an integer");
            }
        }
        printIntegers(upperBound);
    }
}