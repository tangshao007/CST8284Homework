

/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 17 September
 * Modified: 17 September
 * Description: practice of javadoc
 */

/** This class  keep track of how many times a user clicked on a button.
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 */
public class ButtonCounter {

	/**
	 * The count value associated with the button.
	 */
	public int count = 0 ;
	
	
	/**
	 * One-argument ButtonCounter constructor.
	 * Constructs a new ButtonCounter with the specified count value.
	 * @param count the initial count value for the ButtonCounter.
	 */
	public ButtonCounter(int count) {
		this.count = count;
	}//end one-argument ButtonCounter constructor
	
	
	/**
	 * No-ButtonCounter constructor.
	 * Constructs a new ButtonCounter.
	 */
	public ButtonCounter() {
	
	}//end no-argument ButtonCounter constructor
		

	/**
	 * return the current count value of ButtonCounter.
	 * @return the current count value.
	 */
	public int getCount() {
		return count;
	}//end method getCount
	
	
	/**
	 * set a new count value for the ButtonCounter.
	 * @param count the new count value to set.
	 */
	public void setCount(int count) {
		this.count = count;
	}//end method setCount
	
	
	/**
	 * This method is called when the user "clicks".
	 * Add one of the "clicks".
	 */
	public void click() {
		count++;
	}//end method click
	
	
	/**
	 * This method is called when the user "undo".
	 * Remove one of the clicks.
	 * Use if else clause to protect count from being negative.
	 */
	public void undo() {
		if(count > 0) {
		count--;
		}
		else {
			System.out.println("wrong");
		}
			
	}//end method undo
	
	
	/**
	 * This method reports the final value of clicks.
	 * Use while loop to prevent negative value .
	 */
	public void getValue() {
		while(count >= 0) {
			System.out.println(count);
			break;
			}
	}//end method getValue

	
	
	/**
	 * This method reset the number of clicks.
	 */
	public void reset() {
		count = 0;
	}//end method reset
	
}//end class ButtonCounter
