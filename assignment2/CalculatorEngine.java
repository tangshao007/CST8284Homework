/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:26 Nov
 * Description: Assignment practice of Exception Handling
 */
package assignment2;


/**
 * Represents the engine of the calculator, providing basic arithmetic operations.
 * @version 1.0
 */
public class CalculatorEngine {

    /**
     * Adds two integers.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The result of the addition.
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The result of the subtraction.
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The result of the multiplication.
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides the first integer by the second. Handles division by zero gracefully.
     *
     * @param num1 The dividend.
     * @param num2 The divisor.
     * @return The result of the division.
     */
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Can not divide by zero! Result is invalid, returning zero.");
        }
        return num1 / num2;
    }
}
