package labCode;
public class Bicycle extends Vehicle {
	
	private double weight;
	private int gears;
	private String metal;
	
	public Bicycle(String color, double price, int maxSpeed, double weight, int gears, String metal) {
		super(color, price, maxSpeed);
		this.weight = weight;
		this.gears = gears;
		this.metal = metal;
	}

	@Override
	public String toString() {
		return "Bicycle [weight=" + weight + ", gears=" + gears + ", metal=" + metal + super.toString() + " ]";
	}
	
	@Override
	public void printInvoice() {
		System.out.println("price of bicycle " + super.getPrice() + " taxes $50.00 " + (super.getPrice()+50));
	}
	
	public double computeTotalPrice() {
		return super.getPrice() + 50;
	}
	
	
	
	
	
	

}
