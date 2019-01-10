package Chapter05;

import java.util.Scanner;

/**
 * program the users information for a set of integers and much tell the user
 * the average total and how many postitives their are and how many negatives
 * there are
 *
 * @author Isaiah Hajabolhassan
 */
public class C5_1 {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if is is 0: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }

        int positive = 0;
        int negative = 0;
        double total = 0;
        int count = 0;
        while (number != 0) {
            if (number > 0) {
                ++positive;
            } else {
                ++negative;
            }

            total += number;
            ++count;

            number = input.nextInt();
        }

        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + (total / count));
    }
}
