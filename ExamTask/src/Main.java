
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car toyota = new Car("Corolla",2000,"Blue");
		Car opel = new Car("Vectra",1999,"Metallic");
		Car audi = new Car("A4",2009,"Cyan");
		Bus avtobus1 = new Bus("Ikarus",1990,"Red",2.50);
		Bus avtobus2 = new Bus("Mercedes",2010,"Green",1.60);
		Bus avtobus3 = new Bus("Solaris",2005,"Gray",2.80);
		
		
		System.out.println("Distributor: " + Product.MAKER + " offers the following cars: ");
		System.out.println();
	System.out.println("Car Model " + toyota.getMake() + ", year " + toyota.getYear() + " and the color is " + toyota.getColor());
	System.out.println("Car Model " + opel.getMake() + ", year " + opel.getYear() + " and the color is " + opel.getColor());
	System.out.println("Car Model " + audi.getMake() + ", year " + audi.getYear() + " and the color is " + audi.getColor());
	System.out.println();
	System.out.println("Distributor: " + Product.MAKER + " also offers public transport on the following prices:  ");
	System.out.println();
	System.out.println("Bus Model " + avtobus1.getMake() + ", year " + avtobus1.getYear() + " and the color is " + avtobus1.getColor() + " and the rates are: " + avtobus1.getPrice());
	System.out.println("Bus Model " + avtobus2.getMake() + ", year " + avtobus2.getYear() + " and the color is " + avtobus2.getColor() + " and the rates are: " + avtobus2.getPrice());
	System.out.println("Bus Model " + avtobus3.getMake() + ", year " + avtobus3.getYear() + " and the color is " + avtobus3.getColor() + " and the rates are: " + avtobus3.getPrice());
	System.out.println();
	
	avtobus1.setPrice(1.50);
	avtobus2.setPrice(1.00);
	avtobus3.setPrice(1.80);
	
	System.out.println("If you are retired or a student in school/university, with the discount your prices for public transportations are: ");
	System.out.println("The discount price for the ticket for the bus " + avtobus1.getMake() + " is " + avtobus1.getPrice());
	System.out.println("The discount price for the ticket for the bus " + avtobus2.getMake() + " is " + avtobus2.getPrice());
	System.out.println("The discount price for the ticket for the bus " + avtobus3.getMake() + " is " + avtobus3.getPrice());
	System.out.println();
	System.out.println("For more contacts - " + Product.PHONE);
	
	
	
	}
}
