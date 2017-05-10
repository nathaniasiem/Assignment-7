
import java.util.Scanner;



/**
 *
 * @author simon7323
 */
public class A7Q6 {
    /**
     * Method to find the last digit of a number
     * @param num-the number that user enters
     * @return 
     */
    public static int lastDigit(int num){
        //calculates remainder with division of 10 in order to get last digit
        int lastDig=num%10;
        //condition when negative, it becomes positive
        if(lastDig<0){
            lastDig = lastDig*-1;
        }
        return lastDig;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to scan input
        Scanner input = new Scanner (System.in);
       
        // ask user to input a number
        System.out.println("Enter a number:");
        //store input into variable
        int number = input.nextInt();
        
        //call lastDigit method
        int digit=lastDigit(number);
        System.out.println("The last digit for "+number+" is "+ digit+'.');
        
    }
}
