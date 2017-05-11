
import java.util.Scanner;

/**
 *
 * @author simon7323
 */
public class A7Q5 {

    /**
     *
     * @param line-number lines in the pattern
     * @return
     */
    public static void chaotic(int line) {

        //this generates the random number to create pattern
        //until the indicated length of the pattern
        for (int i = 0; i < line; i++) {
            int randNum = (int) (Math.random() * (5 - 1 + 1) + 1);
            for (int j = 0; j < randNum; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner to scan input
        Scanner input = new Scanner(System.in);

        //ask user to input number of line for the pattern
        System.out.println("Enter the number of lines for the pattern: ");
        int linePtrn = input.nextInt();
        
        //call chaotic method
        chaotic(linePtrn);



    }
}
