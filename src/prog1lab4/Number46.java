package prog1lab4;

/**
 * This program
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 */
public class Number46 {

    /**
     * This program uses a for loop to output the sum of all the integers
     * between 10 and 20, inclusive.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 0;

        for (int i = 10; i < 21; i++) {
            number = number + i;   // or number += i
        }
        System.out.println("\nThe total is " + number);
    }
}
