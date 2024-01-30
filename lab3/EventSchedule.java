import java.time.LocalDate;

/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 8 October
 * Modified: 8 October
 * Description: practice of overloaded constructor chaining using "this" keyword.
 */



/**
 * This class is named EventSchedule Class. It shows constructor chaining using keyword "this".
 * In this code, the simpler constructors all call the more complex one,finally get the current EventSchedule.   
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 */
public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;
	
	/**
	 * month component of the date of EventSchedule.
	 */
	private int month;
	
	/**
	 * day component of the date of EventSchedule.
	 */
	private int day;
	
	
	/**
	 * set the current date of EventSchedule to static variable localDate.
	 */
	static LocalDate localDate = LocalDate.now();
	
	
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		this(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		System.out.println("EventSchedule() was called");		
	}
	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	public EventSchedule(int year) {
		this(year,localDate.getMonthValue(),localDate.getDayOfMonth());
		System.out.println("EventSchedule(int) was called");	
	}
	

	
	/**
	 * This constructor sets the year as passed, month as passed,
	 * and day to current day.
	 * @param year The year of this EventSchedule.
	 * @param month The month of this EventSchedule.
	 */
	public EventSchedule(int year,int month) {
	this(year,month,localDate.getDayOfMonth());
	System.out.println("EventSchedule(int,int) was called");
	}

	
	/** 
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month The month of this EventSchedule.
	 * @param day The day of this EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("EventSchedule(int, int, int) was called");		
	}

	
	/**
	 *  This is a getter which return the year of EventSchedule.
	 * @return year of this EventSchedule.
	 */
	public int getyear() {
		return year;
	}
	
	
	/**
	 * This is a setter or mutator method which takes the year as parameter and sets the private field year to that value.
	 * @param year The year for this EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}
	
	/**
	 *  This is a getter which return the month of EventSchedule.
	 * @return month of this EventSchedule.
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * This is a setter or mutator method which takes the month as parameter and sets the private field month to that value.
	 * @param month this is the month to set for EventSchedule.
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	/**
	 * This is a getter which return the day of EventSchedule.
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}
	
	/**
	 * This is a setter or mutator method which takes the day as parameter and sets the private field day to that value.
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}
	
	
	/**
	 * This method print a report showing the EventSchedule
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
