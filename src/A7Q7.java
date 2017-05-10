
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A7Q7 {

    public static int firstDigit(int num){
        
        int firstDig = num%10;
        
        if(firstDig<0){
            firstDig=firstDig*-1;
        }
        
        return firstDig;
        
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
        int fDigit=firstDigit(integer);
        System.out.println("The first digit of "+integer+" is "+fDigit);
    }
}
