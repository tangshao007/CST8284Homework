/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 15 October
 * Modified: 15 October
 * Description: practice of inheritance and JUnit
 */
package assign1;

import java.util.Calendar;

/**
 * This class is named MyHealthData Class.
 * It's a Electronic Health Records (EHR) System, 
 * it contains basic health data and use inherited method to calculate BMI data about patients ,
 * as well as method to print the health data report.
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 * @see MyHealthDataBase
 */
public class MyHealthData extends MyHealthDataBase
{

	/**
	 * first name of patient
	 */
	private String firstname;
	
	/**
	 * last name of patient
	 */
	private String lastname;
	
	/**
	 * gender of patient
	 */
	private String gender;
	
	
	/**
	 * birth year of patient
	 */
	private int birthYear;
	
	
	/**
	 * year of current date
	 */
	private int currentYear = Calendar.getInstance().get(Calendar.YEAR);
	
	/**
	 * height of patient in cm
	 */
	private double height;
	
	/**
	 *  weight of patient in cm
	 */
	private double weight;
    


    /**
     * This constructor sets the first name,last name, gender,birth year,height and weight as passed
     * @param firstname the first name of patient
     * @param lastname the last name of patient
     * @param gender the gender of patient
     * @param birthYear the birth year of patient
     * @param height the height of patient
     * @param weight the weight of patient
     */
	public MyHealthData(String firstname,String lastname,String gender,int birthYear,double height,double weight){
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;		
	}
	



	/**
	 * This is a getter which return the first name of patient.
	 * @return firstname the first name of patient.
	 */
	public String getFirstname() {
		return firstname;
	}



	/**
	 * This is a setter or mutator method which takes the firstname as parameter and sets the private field firstname to that value.
	 * @param firstname the first name of patient.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	/**
	 * This is a getter which return the last name of patient.
	 * @return lastname the last name of patient.
	 */
	public String getLastname() {
		return lastname;
	}



	/**
	 * This is a setter or mutator method which takes the lastname as parameter and sets the private field lastname to that value.
	 * @param lastname the last name of patient.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	/**
	 * This is a getter which return the gender of patient
	 * @return gender the gender of patient
	 */
	public String getGender() {
		return gender;
	}



	/**
	 * This is a setter or mutator method which takes the gender as parameter and sets the private field gender to that value.
	 * @param gender the gender of patient
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}



	/**
	 * This is a getter which return the birth year of patient.
	 * @return birthYear the birth year of patient.
	 */
	public int getBirthYear() {
		return birthYear;
	}



	/**
	 * This is a setter or mutator method which takes the birthYear as parameter and sets the private field birthYear to that value.
	 * @param birthYear the birth year of patient.
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}



	/**
	 * This is a getter which return the height of patient.
	 * @return height the height of patient.
	 */
	public double getHeight() {
		return height;
	}



	/**
	 * This is a setter or mutator method which takes the height as parameter and sets the private field height to that value.
	 * @param height the height of patient.
	 */
	public void setHeight(double height) {
		this.height = height;
	}



	/**
	 * This is a getter which return the weight of patient.
	 * @return weight the weight of patient.
	 */
	public double getWeight() {
		return weight;
	}



	/**
	 * This is a setter or mutator method which takes the weight as parameter and sets the private field weight to that value.
	 * @param weight the weight of patient.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}



	/**
	 * This is a getter which return the year of current date.
	 * @return currentYear the year of current date..
	 */
	public int getCurrentYear() {
		return currentYear;
	} 

   
	

	/**
	 * This method calculate age
	 * @return the calculated result -- age
	 */
	public int getAge() {
		return currentYear - birthYear;
	
	}
	
	/**
	 * This method calculate Maximum Heart Rate
	 * @return the calculated result -- Maximum Heart Rate
	 */
	public int CalculateMaximumHeartRate() {
		
		return 220 - getAge() ;
	}

	/**
	 *  This method calculate Target Heart Rate Range
	 *  @return Target Heart Rate Range
	 */
	public String calculateTargetHeartRateRange() {
	
		double MinimumTargetHeartRate = 0.5*CalculateMaximumHeartRate();
		double MaximumTargetHeartRate = 0.85*CalculateMaximumHeartRate();
		return MinimumTargetHeartRate + "-" + MaximumTargetHeartRate ;
	}
	
	
	/**
	 * This method prints the health data for the patient
	 */
    public void displayMyHealthData() 
    { 

    	System.out.printf(" First name:%s\n",firstname);
    	
    	System.out.printf(" Last name:%s\n",lastname);
  
    	System.out.printf(" Gender:%s\n",gender);
    	
    	System.out.printf(" Year of birth:%d\n ",birthYear);
    	
    	System.out.printf(" Height:%f\n",height);
    	
    	System.out.printf(" Weight:%f\n ",weight);
    	
    	System.out.printf(" Age in years:%d\n ",getAge());
    	
    	System.out.printf(" maximum heart rate:%d\n ", CalculateMaximumHeartRate());
    	
    	System.out.printf(" target heart rate range(MinimumHeartRate and MaximumHeartRate):%s\n" ,calculateTargetHeartRateRange());
    	
    	System.out.printf(" the BMI values:%f\n" ,super.calculateBMI(weight,height));
    	
 
    	

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    }



	

} // end class MyHealthData