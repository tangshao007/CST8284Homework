/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:19 Nov
 * Description: Lab6 practice of Exception Handling
 */


/**
 This class is called the PaymeInterfaceTest Class and provides the main method for the program.
 This program runs polymorphically and test my interface Payme to computes the payment for each category of programmers.
 Implement an array to capture the different categories of programmers.
 */
public class PaymeInterfaceTest  {

public static void main(String[] args) {
	

// CREATE SIX-ELEMENTS Payme array
Payme [] paymeObjects = new Payme[6];

    paymeObjects[0] = new Invoice("22776","brakes",3,300);
    paymeObjects[1] = new Invoice("33442","gear",5,90.99);
    paymeObjects[2] = new SalariedProgrammer("Chioma","Tang","345-67-0001",320);
    paymeObjects[3] = new HourlyProgrammer("Amara","Tang"," 234-56-7770",18.95,40);
    paymeObjects[4] = new CommissionProgrammer("Peter","Tang"," 123-45-6999",16500,0.44);
    paymeObjects[5] = new BasePlusCommissionProgrammer("Esther","Tang","102-34-5888",1200,0.04,720);



 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 for (Payme currentPayme : paymeObjects) {

    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString());


    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer =
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.05 * oldBaseSalary);
       System.out.printf(
          "new base salary with 5%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    }

     System.out.printf("%s: $%,.2f \n","payment due",currentPayme.getPaymentAmount());


     System.out.println();

 }
}
}


