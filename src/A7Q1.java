
import java.util.Scanner;


/**
 *
 * @author simon7323
 */

public class A7Q1 {
    /**
     * calculates the area of the circle
     * @param radius- radius of the circle
     * @return 
     */
    public static double circleArea(double radius){
        //calculate the area of the circle
        double rSquared=Math.pow(radius,2);
        double area = rSquared*Math.PI;
        //send back answer
        return area;
            }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner to scan input
        Scanner input = new Scanner (System.in);
        
        //ask user to input the radius
        System.out.println("Insert the radius of the circle: ");
        int radius=input.nextInt();
        
        //calculate the area
        double totalArea= circleArea(radius);
        
        //print out answer
        System.out.println("The area of the circle is: "+totalArea);
        
    }
}
