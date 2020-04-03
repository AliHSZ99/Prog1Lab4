package prog1lab4;

/**
 *
 * @author Ali Zoubeidi
 */
public class Number47 {

    /**
     * This program uses a for loop to output the product of all the integers
     * between 3 and 7 inclusive.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 3;
        
        for (int i = 4; i < 8; i++) {
            number = number*i;    // or  number *= i
        }
        System.out.println("The product of all the integers between 3 & 7 inclusive is " +
                            number);
    }
}
