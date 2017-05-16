
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
        // set a variable that assumes all digits are odds
        boolean isOdd = true;
        //condition when the number has a 0 
        //indicates not all digits are odd
        if (num == 0) {
            isOdd = false;
        }
        //create loop 
        //when number does not have a 0
        //divide by 10 with remainder;to pull apart the number
        while (num != 0) {
            int digit = num % 10;
            //condition when dividing by 2 the remainder is 0
            //indicates that not all digits are odd
            if (digit % 2 == 0) {
                isOdd = false;
            }
            //keep continuing to go divide by 10 to go through all digits
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