package prog1lab4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Ali Zoubeidi <alihsz2002@gmail.com>
 */
public class Number45 {

    /**
     * This program read double values from a file named input.txt and
     * calculates the average.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        double number = 0;
        int count = 0;        
        
        
        File inputFile = new File("input.txt");
        Scanner file = new Scanner(inputFile);
        
        while (file.hasNext()) {
            number = file.nextInt();
            number = number + file.nextInt();
            count++;
            
        }
        System.out.println("The average of the file is " + number/count);
    }
}

// Don't know how to make this program work...
