/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */



/**
 * This is the BasePlusCommissionProgrammer class which extends CommissionProgrammer
 * the payment of base-plus commission programmer is determined by gross weekly sales, commission percentage and base salary per week
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

  /**
   *  Constructs a base-plus commission programmer with first name, last name , social security number,gross weekly sales, commission percentage and base salary per week
   * @param firstName the first name of the base-plus commission programmer
   * @param lastName the last name of the base-plus commission  programmer
   * @param socialSecurityNumber the social security number of the base-plus commission programmer
   * @param grossSales the gross weekly sales of the base-plus commission programmer
   * @param commissionRate the commission percentage of the base-plus commission programmer
   * @param baseSalary the base salary per week of the base-plus commission programmer
   */
  public BasePlusCommissionProgrammer(String firstName, String lastName,
String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, 
  grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

//return base salary
public double getBaseSalary() {
return baseSalary;
}




  /**
   * This portion of code return the category of programmer
   * @return category of programmer
   */
public String getTitle(){
  return  "base-plus commission Programmer";
}

  /**
   * This method overrides abstract method getPaymentAmount in Programmer to calculate payment due of base-plus commission programmers
   * @return the payment due of base-plus commission programmer
   */
@Override                                                            
public double getPaymentAmount() {
return getBaseSalary() + super.getPaymentAmount();
} 


  /**
   * This portion of code output the details of the base-plus commission programmer
   * @return String representation of BasePlusCommissionProgrammer object
   */
@Override
public String toString(){

  return String.format("%s; %s: $%,.2f ",
          super.toString(), "base salary",getBaseSalary());
}



}



