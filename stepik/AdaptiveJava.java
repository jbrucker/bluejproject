package stepik;

import java.util.Scanner;
/**
 * Problems from stepik.org Adaptive Java course.
 *
 * @author James Brucker
 */
public class AdaptiveJava
{
    public static final Scanner console = new Scanner(System.in);
    
    public static void star_figure(int size)
    {
        if (size==0) size = console.nextInt();
        char[][] m = new char[size][size];
        // fill it with '.'
        for(int row=0; row<size; row++) java.util.Arrays.fill(m[row], '.');
        // fill center row and col with '*'
        int col = size/2;  // only works if n is odd, e.g. n=5 then n/2 is 2
        for(int row=0; row<size; row++) m[row][col] = '*';
        int crow = size/2;
        java.util.Arrays.fill(m[crow], '*');
        // main diagonals
        for(int row=0; row<size; row++) {
            m[row][row] = '*';
            m[row][size-row-1] = '*';
        }
           
    }
    
    public static void main(String[] args) {
        star_figure(5);
    }
}
