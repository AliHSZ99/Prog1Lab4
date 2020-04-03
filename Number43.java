package prog1lab4; 

import java.util.Scanner;

/**
 * This program asks the user to input a value that is greater than 10 and
 * performs the square root of that value until the answer is smaller than 1.01.
 * The program outputs how many times the square root operation was performed.
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 */
public class Number43 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer that is greater then 10 > ");
        double number = scan.nextDouble();
        System.out.println("The number you entered is " + number);

        int count = 0;

        while (number <= 10) {
            System.out.print("\nPlease enter a number that is over 10 > ");
            number = scan.nextInt();
        }

        while (number > 1.01) {
            number = Math.sqrt(number);
            count++;

        }

        System.out.println("The square root was performed " + count + " times");

    }
}
