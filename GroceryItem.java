
public class GroceryItem {
	private String name; 
	private double price; 
	private boolean taxable;
	
	public GroceryItem (String name, double price, boolean taxable) {
		this.name = name;
		this.price = price;
		this.taxable = taxable;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean getTaxable() {
		return taxable;
	}
	
	public boolean equals(Object obj){ 
		return true;
	} 
	public String toString() { 
		return getName() + ": $" + getPrice() + " : " + getTaxable();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}