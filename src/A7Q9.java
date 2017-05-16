
import java.util.Scanner;

/**
 *
 * @author simon7323
 */
public class A7Q9 {

    /**
     * method to determine if the number contains all odd numbers
     *
     * @param num-number user inputs
     * @return
     */
    public static boolean allDigitsOdd(int num) {

        boolean isOdd = true;
        if (num == 0) {
            isOdd = false;
        }
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                isOdd = false;
            }
            num /= 10;
        }
        return isOdd;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to scan input
        Scanner input = new Scanner(System.in);

        //ask user to input a number
        System.out.println("Enter a number: ");
        int integer = input.nextInt();

        //call method allDigitsOdd
        boolean result = allDigitsOdd(integer);
        
        //tell user whether or not their number includes all odd digits
        if (result == true) {
            System.out.println("All of the digits are odd");
        } else {
            System.out.println("Not all of the digits are odd.");
        }
    }
}