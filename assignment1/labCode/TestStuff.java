package labCode;
public class TestStuff {
	
	private Bicycle b1 = new Bicycle("green", 610, 34, 7, 9, "aluminum");
	private Bicycle b2 = new Bicycle("green", 700, 34, 7, 9, "aluminum");
	private Bicycle b3 = new Bicycle("green", -200, 34, 7, 9, "aluminum");
	
	
	public TestStuff() {
		
	}


	public boolean testComputeTotalPrice() {
		
		double smallNumber = 0.0000001;
		boolean result = true;
		
		double total1 = b1.computeTotalPrice();
		
		if (Math.abs(total1 - 660.00) > smallNumber) {
			return false;
		}
		
		double total2 = b2.computeTotalPrice();
		
		if (Math.abs(total2 - 750.00) > smallNumber) {
			return false;
		}
		
		double total3 = b3.computeTotalPrice();
		
		if (Math.abs(total3 - -150.00) > smallNumber) {
			return false;
		}
		
		//assertEquals(total3, -150, 0.00001);
		
		return true;
		
		
	}

}
