package prog1lab4;

import java.util.Scanner;
import java.util.Random;

/**
 * This program gives the user 10 tries to be able to guess a random number
 * between 0 and 100
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 */
public class TenTrials {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean bolAnswer = true;

        while (bolAnswer) {
            bolAnswer = false;
            Scanner scan = new Scanner(System.in);

            Random random = new Random();
            int randomNum = random.nextInt(101);

            System.out.println("\nWELCOME TO THE GUESSING GAME!");
            System.out.println("You have 10 tries to guess an integer in the range 0-100!");
            //System.out.println(randomNum);  // Used to check if program works

            boolean numFound = false;

            String yeah = "yes";

            for (int i = 0; i < 10 && (numFound == false); i++) {
                System.out.print("\nEnter your guess > ");
                int guess = scan.nextInt();

                if (guess == randomNum) {
                    numFound = true;
                    System.out.println("You have guessed the right number: " + randomNum);
                    System.out.println("Would you like to play again? Enter yes or no> ");
                    String answer = scan.next().trim();

                    if (yeah.equalsIgnoreCase(answer)) {
                        System.out.println("you did it!");
                        bolAnswer = true;
                    }

                }

            }

            System.out.println("\nGame Over! Thanks for playing :)");
            System.out.println("The number was " + randomNum);
                                
        }

    }
}
