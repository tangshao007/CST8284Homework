/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 15 October
 * Modified: 15 October
 * Description: practice of inheritance and JUnit
 */

package assign1;

import java.util.Scanner;


/**
 * This is the driver class for this program. It prints the health data for patients.
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 * @see MyHealthData
 */
public class MyHealthDataTest {

	/**
	 * The main class is used to accept user's basic health data and call method to print the health data
	 * @param args an array of String arguments that can be passed to the program from the command line.
	 */
	public static void main(String[] args) {
	
		//declare variables
		String firstname;
		String lastname;
		String gender;
		int birthYear;
		double height;
		double weight;
		
		Scanner scanner = new Scanner(System.in);
		


		//let the user to input first name and accept it into firstname field
		System.out.println("Please input your first name:");
		firstname = scanner.nextLine();
	
		//let the user to input last name and accept it into lastname field
		System.out.println("Please input your last name:");
		lastname = scanner.nextLine();

		//let the user to input gender and accept it into gender field
		System.out.println("Please input your gender:");
		gender = scanner.nextLine();
	
		
		//let the user to input birth year and accept it into birthYear field
		System.out.println("Please input your birth year:");
		birthYear = scanner.nextInt();
	
		//let the user to input weight and accept it into weight field
		System.out.println("Please input your height:");
		height = scanner.nextDouble();
	
		//let the user to input height and accept it into height field
		System.out.println("Please input your weight:");
		weight = scanner.nextDouble();
	
		//creat a new object and call the constructor to initialize the health data of the patient
		MyHealthData myHealthData = new MyHealthData(firstname,lastname,gender,birthYear ,height, weight);
		
		//call the method displayMyHealthData to print the health data
		myHealthData.displayMyHealthData();
		
		
		
	}

}
