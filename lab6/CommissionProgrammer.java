/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */



/**
 * This is the CommissionProgrammer concrete class which extends abstract Programmer
 * the payment of commission programmer is determined by gross weekly sales, commission percentage
 */
public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage

  /**
   * Constructs a commission programmer with first name, last name , social security number gross weekly sales and commission percentage
   * @param firstName the first name of the commission programmer
   * @param lastName the last name of the commission programmer
   * @param socialSecurityNumber the social security number of the commission programmer
   * @param grossSales the gross weekly sales of the commission programmer
   * @param commissionRate the commission percentage of the commission programmer
   */
  public CommissionProgrammer(String firstName, String lastName,
String socialSecurityNumber,
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

//set gross sales amount on the creation of apps
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

//return gross sales amount 
public double getGrossSales() {
return grossSales;
} 

//set commission rate
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

//return commission rate
public double getCommissionRate() {
return commissionRate;
} 



  /**
   * This portion of code return the category of programmer
   * @return category of programmer
   */
  public String getTitle(){
    return  "commission Programmer";
  }


  /**
   * This method overrides abstract method getPaymentAmount in Programmer to calculate payment due of commission programmers
   * @return the payment due of commission programmer
   */
@Override                                                           
public double getPaymentAmount() {
return getCommissionRate() * getGrossSales();                    
}


  /**
   * This portion of code output the details of the commission programmer
   * @return String representation of CommissionProgrammer object
   */
@Override
  public String toString(){

  return String.format("%s: %s \n%s: $%,.2f; %s: %,.2f ",
          getTitle(),super.toString(),
          "gross sales",getGrossSales(),
          "commission rate",getCommissionRate());
}


}

