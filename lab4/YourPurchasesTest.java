/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 15 October
 * Modified: 15 October
 * Description: practice of inheritance and JUnit
 */
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;
	
	
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
	  
	}
	

	//test constructor
	@Test
    public void testYourPurchases() {
		YourPurchases p = new YourPurchases();
		assertEquals(0,p.getPurchase(), EPSILON);
		assertEquals(0,p.getPayment(), EPSILON);
	}
	@Test
    public void testGetPurchases() {
		YourPurchases p1 = new YourPurchases();
		p1.recordPurchase(5.2);
		double actual = p1.getPurchase();
		double expected = 5.2;
		Assert.assertEquals(expected,actual,EPSILON);
	}
	@Test
    public void testGetPayment() {
		YourPurchases p2 = new YourPurchases();
		p2.receivePayment(5,1,2,3,2);
		double actual = p2.getPayment();
		double expected = 5.62;
		Assert.assertEquals(expected,actual,EPSILON);
	}
	@Test
    public void testRecordPurchase(){
		YourPurchases p3 = new YourPurchases();
		double expected = 3.2;
		p3.recordPurchase(3.2);
		double purchase = p3.getPurchase();
		Assert.assertEquals(expected,purchase,EPSILON);
   	 
	}
	@Test
    public void testreceivePayment(){
		YourPurchases p4 = new YourPurchases();
		double expected = 3.15;
		p4.receivePayment(2,4,1,0,5);
		double payment = p4.getPayment();
		Assert.assertEquals(expected,payment,EPSILON);
	}
	
	@Test
    public void testGiveChange(){
		YourPurchases p5 = new YourPurchases();
		p5.recordPurchase(1.5);
		p5.receivePayment(5, 0, 0, 0, 0);
		double change = p5.giveChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, change, EPSILON);
	}

	
	
	
	
}

