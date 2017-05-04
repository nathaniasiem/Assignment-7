
import java.util.Scanner;

/**
 *
 * @author simon7323
 */
public class A7Q3 {

    /**
     * Method for finding all factors of a number
     *
     * @param number -number to factor
     * @return -print out the factors
     */
    public static int factor(int number) {

        //set variable of starting factor
        int factorNum = 1;

        //create a loop to go through each number
        System.out.println("Your factors for " + number + " are:");
        while (factorNum <= number) {
            //condition if each number gives a quotient with no remainders
            if (number % factorNum == 0) {
                System.out.println(factorNum);
            }
            //increase position after each factor found
            factorNum++;
        }
        return 0;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan in input
        Scanner input = new Scanner(System.in);

        //ask user to input number to factor
        System.out.println("Enter number you wish to factor: ");
        int integer = input.nextInt();

        //find the factors
        int factorNumber = factor(integer);
    }
}
