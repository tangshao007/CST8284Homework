import java.time.LocalDate;

/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 8 October
 * Modified: 8 October
 * Description: practice of overloaded constructor chaining using "this" keyword.
 */


/**
 * This is the driver class for this program. It use different constructors to show the current EventSchedule
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 * @see EventSchedule
 */
public class TestDemo {

	/**
	 * The main class is used to instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall()
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
	    //set the current date of EventSchedule to  variable localDate.
		LocalDate localDate = LocalDate.now();

		//create a new object to call the no-parameter constructor and print the EventSchedule
		System.out.println("EventSchedule1");
		EventSchedule EventSchedule1 = new EventSchedule();
		System.out.println(EventSchedule1.createReport());
		

		//create a new object to call the one-parameter constructor and print the EventSchedule
		System.out.println("EventSchedule2");
		EventSchedule EventSchedule2 = new EventSchedule(localDate.getYear());
		System.out.println(EventSchedule2.createReport());


		//create a new object to call the two-parameter constructor and print the EventSchedule
		System.out.println("EventSchedule3");
		EventSchedule EventSchedule3 = new EventSchedule(localDate.getYear(),localDate.getMonthValue());
		System.out.println(EventSchedule3.createReport());
		
		//create a new object to call the three-parameter constructor and print the EventSchedule
		System.out.println("EventSchedule4");
		EventSchedule EventSchedule4 = new EventSchedule(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		System.out.println(EventSchedule4.createReport());

	}

}
