
import java.util.Scanner;

/**
 *
 * @author simon7323
 */
public class A7Q7 {

    /**
     *Method to find the first digit of a number
     * @param num - number user wants to find the first digit of
     * @return
     */
    public static int firstDigit(int num) {

        //set starting divisor
        int divisor = 1;

        //divides the number by 10 repeatedly until reaches a single digit
        while (num / divisor >= 10) {
            divisor *= 10;

        }
        //condition for returning the first digit as a positive number when a number is negative
        if (num < 0) {
            num = num * -1;
        }

        return num / divisor;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to scan in input
        Scanner input = new Scanner(System.in);

        //ask user to enter in a number
        System.out.println("Enter in a number:");
        int integer = input.nextInt();

        //call firstDigit method
        int fDigit = firstDigit(integer);
        System.out.println("The first digit of " + integer + " is " + fDigit);
    }
}
