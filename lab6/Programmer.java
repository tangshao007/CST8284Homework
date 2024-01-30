/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */



/**
 * This is the Programmer class which is an abstract superclass that IMPLEMENTS the Payme interface
 */
public abstract class Programmer implements Payme {

private String firstName;
private String lastName;
private String socialSecurityNumber;


 /**
  * Constructs a programmer with first name, last name and social security number
  * @param first the first name of the programmer
  * @param last the last name of the programmer
  * @param ssn the social security number of the programmer
  */
 public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}

//get first name
 public String getFirstName() {
  return firstName;
 }

 //set first name
 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 //get last name
 public String getLastName() {
  return lastName;
 }

 //set last name
 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 //get social security number
 public String getSocialSecurityNumber() {
  return socialSecurityNumber;
 }

 //set social security number
 public void setSocialSecurityNumber(String socialSecurityNumber) {
  this.socialSecurityNumber = socialSecurityNumber;
 }



 /**
  * This portion of code output the details of the programmer
  * @return  String representation of Programmer object
  */
 @Override
public String toString() {
return String.format("%s %s\n%s: %s",
         getFirstName(), getLastName(),
        "social security number",getSocialSecurityNumber());
} 



 /**
  *This is an abstract method which calculates payment due of programmers
  * @return the payment due of programmer
  * It makes no sense to provide specific implementation of this method here because earning cannot be calculated for general
  * employee (specific type of employee could have different earnings)
  */
 public abstract double getPaymentAmount();


}


