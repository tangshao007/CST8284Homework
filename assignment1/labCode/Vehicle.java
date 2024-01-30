package labCode;
public class Vehicle {
	
	private String color;
	private double price;
	private int maxSpeed;
	
	public double calc(double x, double y) {
		return x*y;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Vehicle(String color, double price, int maxSpeed) {
		super();
		this.color = color;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}
	
	public void printInvoice() {
		System.out.println("price is " + price + " taxes " + price*0.13 + " total " + price*1.13);
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	
	

}
