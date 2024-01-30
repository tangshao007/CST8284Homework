/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */


/**
 * This is the HourlyProgrammer concrete class which extends abstract Programmer
 * the payment of hourly programmer is determined by wage per hour and hours worked for week
 */
public class HourlyProgrammer extends Programmer {
private double wage; // wage per hour
private double hours; // hours worked for week


  /**
   * Constructs a hourly programmer with first name, last name , social security number, wage per hour and hours worked for week
   * @param firstName the first name of the hourly programmer
   * @param lastName the last name of the hourly programmer
   * @param socialSecurityNumber the social security number of the hourly programmer
   * @param wage the per hour wage of the programmer
   * @param hours the hours worked by the programmer
   */
  public HourlyProgrammer(String firstName, String lastName,  String socialSecurityNumber,
double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

//return wage
public double getWage() {
return wage;
} 

//set hours worked
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

//return hours worked
public double getHours() {
return hours;
} 


  /**
   * This portion of code return the category of programmer
   * @return category of programmer
   */
  public String getTitle(){
    return  "hourly Programmer";
  }


  /**
   * This method overrides abstract method getPaymentAmount in Programmer to calculate payment due of hourly programmers
   * @return the payment due of hourly programmer
   */
  @Override
public double getPaymentAmount() {
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          



  /**
   * This portion of code output the details of the hourly programmer
   * @return String representation of HourlyProgrammer object
   */
  @Override
public String toString(){
  return String.format("%s: %s  \n%s: $%,.2f; %s: %f  ",
          getTitle(),super.toString(),
          "hourly wage",getWage(),"hours worked",getHours());
}

                     
}

