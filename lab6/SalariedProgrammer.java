/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */


/**
 * This is the SalariedProgrammer concrete class which extends abstract Programmer
 * the payment of salaried programmer is determined by weekly salary
 */
public class SalariedProgrammer extends Programmer  {
private double weeklySalary;

  /**
   * Constructs a salaried programmer with first name, last name , social security number and weekly salary
   * @param firstName the first name of the salaried programmer
   * @param lastName the last name of the salaried programmer
   * @param socialSecurityNumber the social security number of the salaried programmer
   * @param weeklySalary the weekly salary of the salaried programmer
   */
  public SalariedProgrammer(String firstName, String lastName,
String socialSecurityNumber, double weeklySalary) {
super(firstName, lastName, socialSecurityNumber);

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

//return salary
public double getWeeklySalary() {
return weeklySalary;
} 


  /**
   * This portion of code return the category of programmer
   * @return category of programmer
   */
  public String getTitle(){
    return  "salaried Programmer";
  }


  /**
   * This method overrides abstract method getPaymentAmount in Programmer to calculate payment due of salaried programmers
   * @return the payment due of salaried programmer
   */
  @Override
public double getPaymentAmount() {
return getWeeklySalary();                                        
}                                             


  /**
   * This portion of code output the details of the salaried programmer
   * @return String representation of SalariedProgrammer object
   */
@Override
public String toString(){
  return String.format("%s: %s \n%s: $%,.2f ",
          getTitle(),super.toString(),
          "weekly salary",getWeeklySalary());
}

}

