/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1lab4;

/**
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 */
public class Number48 {

    /**
     * This program uses a for loop to count how many multiples of 7 are between
     * 33 and 97 inclusive.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 0;
        int multiple7 = 0;

        for (int i = 34; i < 98; i++) {
            number = i % 7;
            if (number == 0) {
                multiple7++;
            }
        }

        System.out.println("There are " + multiple7 + " multiples of seven betweenthe"
                + " numbers 33 and 97, inclusive.");
    }
}
