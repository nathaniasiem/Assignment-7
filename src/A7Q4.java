
import java.util.Scanner;

/**
 *
 * @author simon7323
 */
public class A7Q4 {

    /**
     * Calculate the compound interest
     *
     * @param principal-initial balance
     * @param interest-the interest rate
     * @param years-the number of years
     * @return
     */
    public static double compoundInterest(double principal, double interest, int years) {
        //set variables for equation 
        //used to calculate the balance
        double P = principal;
        double r = interest;
        int n = years;

        //calculate the compound interest
        double balance = Math.pow(P * (1 + r), n);
        balance = Math.round(balance * 100) / 100.0;

        return balance;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan input
        Scanner input = new Scanner(System.in);

        //ask user to enter the amount of the principal amount
        System.out.println("Enter the intial amount: ");
        double initialAmt = input.nextDouble();

        //ask user to enter the interest rate
        System.out.println("Enter the interest rate: ");
        double intRate = input.nextDouble();

        //ask user for the number of years
        System.out.println("Enter the number of years: ");
        int numYears = input.nextInt();

        //calculate the compound interest with method
        double newBalance = compoundInterest(initialAmt, intRate, numYears);

        //print out the new balance
        System.out.println("Your current balance is " + newBalance);
    }
}
