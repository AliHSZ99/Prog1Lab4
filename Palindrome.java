package prog1lab4;

import java.util.Scanner;

/**
 * This program takes a word or a sentence from the user and detects if it is a
 * palindrome.
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 */
public class Palindrome {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word or sentence to test if it is a palindrome > ");
        String sentence = scan.nextLine();
        sentence = sentence.replaceAll("[\\W]", "").toLowerCase();

        int total = sentence.length();
        int start = 0;
        int end = total - 1;
        int valid = 0;
        int invalid = 0;

        while (start < end) {
            if (sentence.charAt(start) == sentence.charAt(end)) {
                start++;
                end--;
                valid++;
            } else if (sentence.charAt(start) != sentence.charAt(end)) {
                start++;
                end--;
                invalid++;
            }
        }

        if (start == total) {
            System.out.println("You have not entered a word or a sentence...");
        } else if (invalid > 0) {
            System.out.println("This is not a palindrome...");
        } else if (valid > 0) {
            System.out.println("This is a palindrome!!!");
        } else if (start <=1) {
            System.out.println("You have entered a letter...");
        }

    }
}
