
public class Car {

	private String make; 
	private int year;
	private String color;
	
	public Car (String make, int year, String color)
	{
		// stoinosti na field-ovete
		this.make = make;
		this.year = year;
		this.color = color;
		
	}
	
	public String getMake() { //metod za markata
		
		return this.make;
	}
	public int getYear() { //metod za godinata
		return this.year;
	}
	public String getColor() { //metod za cveta
		return this.color;
	}
}
