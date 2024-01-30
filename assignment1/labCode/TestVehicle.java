package labCode;
public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1 = new Vehicle("red", 10000, 200);
		
		System.out.println(v1.toString());
		v1.printInvoice();
		
		//String color, double price, int maxSpeed, double weight, int gears, String metal) {
		Bicycle b1 = new Bicycle("blue", 500, 35, 5.5, 18, "carbon");
		Bicycle b2 = new Bicycle("green", 610, 34, 7, 9, "aluminum");
		
		System.out.println(b1.toString());
		
		b1.printInvoice();
		System.out.println(b1.calc(50, 100));
		
		System.out.println("price is " + b1.computeTotalPrice());
		System.out.println("price is " + b2.computeTotalPrice());
		
		TestStuff s1 = new TestStuff();
		System.out.println("test result " + s1.testComputeTotalPrice());
		
		
		
	}

}
