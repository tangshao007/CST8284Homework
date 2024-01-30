/**
 * Student Name:Wenqi Tang
 * Lab Professor:Natalie Gluzman
 * Due Date:12 Nov
 * Description: practice of polymorphism
 */
package polymorphism;

/**
 * This class represents the supervisor. An supervisor is paid the same (particular) amount regardless of the hours the supervisor worked.
 * Apart from their pay, supervisors are also entitled to an additional bonus amount bi-weekly.
 */
public class Supervisors extends Employees{

    /**
     * supervisors' bonus biweekly
     */
    private double bonus;

    /**
     *  Constructs an supervisor with a given name , an annual pay and a bonus.
     * @param name the name of this supervisor
     * @param pay the annual pay of the supervisor
     * @param bonus the bonus of supervisor
     */
    public Supervisors(String name, double pay, double bonus){

        super(name,  pay);
        this.bonus = bonus;
    }

    /**
     * This portion of code computes the bi-weekly pay of work done by the supervisor.
     * @param hoursWorked the number of hours worked bi-weekly
     * @return the pay for the supervisor bi-weekly
     */
    public double biWeeklyPay(int hoursWorked){

        return super.biWeeklyPay(hoursWorked) + bonus;

    }
}
