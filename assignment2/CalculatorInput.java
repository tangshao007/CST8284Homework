/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:26 Nov
 * Description: Assignment practice of Exception Handling
 */

package assignment2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Handles user input, validates equations, and processes calculations based on input.
 * @version 1.0
 */
public class CalculatorInput {
    private CalculatorEngine calculatorEngine;
    public CalculatorInput(CalculatorEngine engine) {
        this.calculatorEngine = calculatorEngine;
    }


    /**
     * Takes user input in a loop until the user enters "0 =".
     */
    public void UserInput() {
        Scanner keyboard = new Scanner(System.in);
        String buffer;

        while (true) {
            System.out.println("Enter your equation: ");
            buffer = keyboard.nextLine();
            if (buffer.equals("0 =")) {
                System.out.println("Program exiting.");
                break;
            }
            HandleInput(buffer);
        }
    }


    /**
     * Handles user input, catches exceptions, and displays appropriate error messages.
     *
     * @param buffer The user input equation.
     */
    public void HandleInput(String buffer) {



        try {
            ProcessInput(buffer);

        }catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    /**
     * Processes the user input, validates the equation, and performs calculations.
     *
     * @param buffer The user input equation.
     */
    public void ProcessInput(String buffer)   {

        int num1, num2;
        String sign, equals;

        Scanner input = new Scanner(buffer);



        //
        if (!input.hasNext()) {
            throw new NoSuchElementException("Error: Equation incomplete. First number is missing");
        }

        //
        if (!input.hasNextInt()) {
            throw new InputMismatchException("Error: First number is not an integer.");
        }
        num1 = input.nextInt();


        //
        if (!input.hasNext()) {
            throw new NoSuchElementException("Error: Equation incomplete. Operator is missing.");
        }
        sign = input.next();

        if (isNotValidOperator(sign)) {
            throw new IllegalArgumentException("Invalid operator. Valid operators are +, -, /, and *");
        }


        //
        if (!input.hasNextInt()) {
            throw new NumberFormatException("Second number is missing.");
        }
        num2 = input.nextInt();


        //
        if (!input.hasNext("=")) {
            throw new IllegalArgumentException("Equation incomplete. Equation must end with =");
        }
        equals = input.next();



        switch (sign) {
            case "+":
                System.out.println("That answer is: " + calculatorEngine.add(num1, num2));
                break;
            case "-":
                System.out.println("That answer is: " + calculatorEngine.subtract(num1, num2));
                break;
            case "*":
                System.out.println("That answer is: " + calculatorEngine.multiply(num1, num2));
                break;
            case "/":
                System.out.println("That answer is: " + calculatorEngine.divide(num1, num2));
                break;
        }


    }

    private boolean isNotValidOperator(String operator) {
        return !operator.equals("+") && !operator.equals("-") &&
                !operator.equals("*") && !operator.equals("/");
    }


}
