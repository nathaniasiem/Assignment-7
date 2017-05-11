
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class A7Q8 {
    
    public static void season(int month,int day){
       //create conditions to compare the date to corresponding season
        //from 
         if (month <= 2 || (month == 3 && day <= 15) || (month == 12 && day > 15 )){
             System.out.println("Winter");
        } else if (month <= 5 || (month == 6 && day <= 15)){
             System.out.println("Spring");
        } else if (month <= 8 || (month == 9 && day <= 15)){
             System.out.println("Summer");
        } else {
             System.out.println("Fall");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to scan input
        Scanner input = new Scanner(System.in);
        
        //ask user to enter in month
        System.out.println("Enter the month in numeric form: ");
        int mo=input.nextInt();
        
        //ask user to enter in day
        System.out.println("Enter the day: ");
        int dy=input.nextInt();
        
        //call season method to find out season
        season(mo,dy);
        
        
    }
}
