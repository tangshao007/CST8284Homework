/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 15 October
 * Modified: 15 October
 * Description: practice of inheritance and JUnit
 */

package assign1;


/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
 * also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 * @see MyHealthData
 */
public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the calculated result -- BMI
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return (weightParam * 703) / (heightParam * heightParam);
    }
    
    
    /**
    * This method is used to show JUnit test execute situation when there is an error in the math.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the calculated result -- BMI
     */
    public double incorrectBMI(double weightParam, double heightParam) {
    	return (weightParam * 70) / (heightParam * heightParam);
    }
}