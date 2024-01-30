
/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 17 September
 * Modified: 17 September
 * Description: test class ButtonCounter
 */

/**
 * This class tests the ButtonCounter class.
 * @author Wenqi Tang
 * @version 1.1
 * @since Java 17.0.7
 * @see ButtonCounter 
 */
public class ButtonCounterTester {

	/**
	 * The main method is the entry point of the Java program.
     * It is automatically called by the Java Virtual Machine (JVM)
     * when the program is started.
	 * @param args an array of String arguments that can be passed to the program from the command line.
	 */
	public static void main(String[]args) {
	
		
	//create a new object of constructor	
	ButtonCounter buttonCounter = new ButtonCounter();
	
    //test click method and display values
	buttonCounter.click();
	buttonCounter.click();
	buttonCounter.click();
	buttonCounter.getValue();//test getValue method and get current count
	System.out.println("Expected: 3");
	
	
	//test undo method and display updated values
	buttonCounter.undo();
	buttonCounter.getValue();//get current count
	System.out.println("Expected: 2");
	
	//test reset method and display updated values
	buttonCounter.reset();
	buttonCounter.getValue();//get current count
	System.out.println("Expected: 0");
	
	}//end method main
	

}//end class ButtonCounterTester
