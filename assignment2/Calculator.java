/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:26 Nov
 * Description: Assignment practice of Exception Handling
 */

package assignment2;

/**
 * The main class of the Calculator program. It initializes the calculator,
 * displays welcome information, and starts the user input loop.
 * @version 1.0
 */
public class Calculator {

    /**
     * The main method of the Calculator program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[]args){

        System.out.println("Welcome to the Assignment 2 CST8284 calculator.\n" +
                        "Written by Wenqi Tang, #041097937\n" +
                        "Equations are in the form num1 operator num2 =\n" +
                        "Where num1 and num2 must be integers,\n" +
                        "operator is one of +, -, / or *\n" +
                        "Enter 0 = to quit.");
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        CalculatorInput calculatorInput = new CalculatorInput(calculatorEngine);

        calculatorInput.UserInput();


    }


}
