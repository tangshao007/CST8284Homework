/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:12 Nov
 * Description: practice of polymorphism
 */

package polymorphism;
import java.util.Scanner;

/**
 This class is called the MillerTest Class and provides the main method for the program.
 This program runs polymorphically and computes the pay for each category of millers in the system.
 The Users are prompted to input hours done worked by each miller.
 Implement an array to capture the different categories of millers.
 */
public class MillersTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfMillers = 3; // You can adjust this based on the number of millers you want to input.

        Millers[] m = new Millers[numberOfMillers];
        m[0] = new Consultants("Abby Obi", 5000);
        m[1] = new Employees("Andrew Goodman", 36000);
        m[2] = new Supervisors("Gloria Myers", 36000, 999);


        for (int i = 0; i < numberOfMillers; i++) {
            System.out.println("Enter the hours done by " + m[i].getName() + ": ");
            int hoursWorked = scanner.nextInt();

            if (m[i] instanceof Consultants) {
                System.out.println("Total Pay for this miller is: " + String.format("%.2f", m[i].biWeeklyPay(hoursWorked)));
            } else if (m[i] instanceof Employees) {
                System.out.println("Total Pay for this miller is: " + String.format("%.2f", m[i].biWeeklyPay(hoursWorked)));
            } else if (m[i] instanceof Supervisors) {
                System.out.println("Total Pay for this miller is: " + String.format("%.2f", m[i].biWeeklyPay(hoursWorked)));
            }

        }

        scanner.close();

    }


}