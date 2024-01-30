/* Student Name: Wenqi Tang
 * Lab Professor: Leanne Seward 
 * Due Date: 15 October
 * Modified: 15 October
 * Description: practice of inheritance and JUnit
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class testDiscount {

	@Test
	public void test(){
		YourPurchases yp1 = new YourPurchases();
		yp1.recordPurchase(10);
		boolean actualPurchase = yp1.checkDiscount() ;
		assertEquals(false,actualPurchase);
	}
	
	@Test
	public void test2() {
		YourPurchases yp2 = new YourPurchases();
		yp2.recordPurchase(10.5);
		boolean actualPurchase = yp2.checkDiscount() ;
		boolean expectedPurchase = true;
		assertEquals(expectedPurchase,actualPurchase); 
		
	}
	
	@Test
	public void test3() {
		YourPurchases yp3 = new YourPurchases();
		yp3.recordPurchase(100);
		boolean actualPurchase = yp3.checkDiscount() ;
		assertEquals(true,actualPurchase); 
		
	}
	
	@Test
	public void test4() {
		YourPurchases yp4 = new YourPurchases();
		yp4.recordPurchase(-100);
		boolean actualPurchase = yp4.checkDiscount() ;
		assertEquals(false,actualPurchase); 
		
	}
	
	@Test
	public void test5() {
		YourPurchases yp5 = new YourPurchases();
		yp5.recordPurchase(501);
		boolean actualPurchase = yp5.checkDiscount() ;
		assertEquals(true,actualPurchase); 
		
	}
	
	
}
