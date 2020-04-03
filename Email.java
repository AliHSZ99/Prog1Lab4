package prog1lab4;

import java.util.Scanner;

/**
 * This program validates a users email address by getting it as an input
 *
 * @author ali Zoubeidi <alihsz2002@gmail.com>
 */
public class Email {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an email that you want to validate > ");
        String email = scan.nextLine().trim();
        System.out.println("The email entered is " + email);

        int start = 0;
        int sizeEmail = email.length() - 1;
        char atSign = '@';
        char dot = '.';
        int atFound = 0;
        int dotFound = 0;

        while (start < sizeEmail) {
            if (email.charAt(start) == atSign) {
                atFound++;
            }
            if (email.charAt(start) == dot) {
                dotFound++;
            }
            if (email.endsWith(".")) {
                System.out.println("Invalid! email ends with a period...");
                System.exit(0);
            }
            start++;
        }

        if (atFound == 1 && dot >= 1) {
            System.out.println("The email " + email + " entered is valid!!!");
        } else {
            System.out.println("The email " + email + " entered is invalid...");
        }

    }
}
