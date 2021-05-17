
public class Bus extends Car implements Product { //nasledqvane na class i realizaciq na metod
	
	private double price;
	
	public Bus(String make, int year, String color, double price) {
		super(make, year, color);
		
		this.price = price;
	}
	
	@Override
	public double setPrice(double price) {
		this.price = price;
		return this.price; //vzemane na stara stoinost i vrushtane na nova, overridevame roditelskiq metod
	}
	
	public double getPrice() { //vzemame stara stoinost
		return this.price;
		
	}
	
	//deklarirame metodi za ceni samo v Bus, tyi kato te sa ekskluzivni za tozi class, no metodite ot Car sa nasledeni
}
