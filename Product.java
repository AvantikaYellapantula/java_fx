public class Product {

	private String name;
	private double price;
	private int quantity;
	
	//couple constructors
	//first
	//take all the properties and give them a default value
	
	public Product() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	
	//second constructor
	//three params
	public Product(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}
//created a shortcut to get to getter and setter methods
	//Cntrl+Alt+G
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
