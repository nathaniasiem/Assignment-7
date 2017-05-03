
import java.util.Scanner;

/**
 *
 * @author simon7323
 */
public class A7Q2 {

    /**
     * setting letter grades with percentages
     *
     * @param letterGrade
     * @return
     */
    public static int examGrade(int mark) {

        //create conditions for the mark percentages
        //condition for percentage above 80
        if (mark >= 80) {
            System.out.println("Your grade is: A");
            //condition for percentage for marks betw. 70-79
        } else if (mark >= 70) {
            System.out.println("Your grade is: B");
            //condition for percentage for marks betw. 60-69
        } else if (mark >= 60) {
            System.out.println("Your grade is: C");
            //condition for percentage for marks betw. 50-59
        } else if (mark >= 50) {
            System.out.println("Your grade is: D");
            //condition for percentage for marks below 50
        } else if (mark < 50) {
            System.out.println("Your grade is: F");
        }

        return mark;

    }

    public static void main(String[] args) {
        // create Scanner to scan in marks
        Scanner input = new Scanner(System.in);

        //ask user to input mark
        System.out.println("Please enter the mark you wish to convert percentage to letter grade: ");
        int grade = input.nextInt();

        //convert the percentage to letter grade
        //use the examGrade method
        int score = examGrade(grade);

    }
}
