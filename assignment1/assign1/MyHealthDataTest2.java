/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 15 October
 * Modified: 15 October
 * Description: practice of inheritance and JUnit
 */
package assign1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHealthDataTest2 {
	

	
	private static final double EPSILON = 0.000001;
	
	@Test
	public void testCalculateBMI() {
		MyHealthDataBase mydb = new MyHealthDataBase();
		double result = mydb.calculateBMI(132,63);
		double expected = 23.380196;
		assertEquals(expected,result,EPSILON);
	}

	
	//errors in MyHealthDataBase: in the method incorrectBMI, the calculate math is wrong, 
	//the part 'weightParam * 70' should be 'weightParam * 703'
	@Test
	public void testIncorrectBMI() {
		MyHealthDataBase mydb = new MyHealthDataBase();
		double result = mydb.incorrectBMI(132,63);
		double expected = 23.380196;
		assertEquals(expected,result,EPSILON);
	}
}
