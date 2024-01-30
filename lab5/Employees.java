/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:12 Nov
 * Description: practice of polymorphism
 */
package polymorphism;

/**
This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/
public class Employees extends Millers{

   /**
    * total number of weeks per year
    */
   public static final int numWeeks = 52;
   /**
    * the annual pay of employee
    */
   private double annualPay;

   /**
      Constructs an employee with a given name and an annual pay.
      @param name the name of this employee
      @param pay the annual pay of the employee
    */
   public Employees(String name, double pay)
   {
      setName(name);
      annualPay = pay;
   }

   /**
    * This portion of code computes the bi-weekly pay of work done by the employee.
    * @param hoursWorked the number of hours worked bi-weekly
    * @return the pay for the employee bi-weekly
    */
   public double biWeeklyPay(int hoursWorked) {
      return annualPay / numWeeks;
   }
}

