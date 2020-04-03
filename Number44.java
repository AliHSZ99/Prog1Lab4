package prog1lab4;

import java.util.Scanner;

/**
 * This program asks the user for an input until that user inputs "@". Then it
 * prints the word and simply terminates.
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 *
 */
public class Number44 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence containing an @ sign > ");
        String sentence = scan.nextLine().trim();

        while (!sentence.contains("@")) {
            System.out.print("\nPlease enter a sentence with the character required > ");
            sentence = scan.nextLine().trim();
        }

        System.out.println("\nThe sentence you entered is " + sentence);
    }
}
